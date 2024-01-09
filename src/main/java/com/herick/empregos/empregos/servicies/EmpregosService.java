package com.herick.empregos.empregos.servicies;

import com.herick.empregos.empregos.dto.CompetenciasDTO;
import com.herick.empregos.empregos.dto.EmpregosDTO;
import com.herick.empregos.empregos.entities.Competencias;
import com.herick.empregos.empregos.entities.Empregos;
import com.herick.empregos.empregos.repositories.EmpregosRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class EmpregosService {
    @Autowired
    private EmpregosRepository repository;

    @Transactional(readOnly = true)
    public Page<EmpregosDTO> findAll(Pageable pageable) {
        Page<Empregos> result = repository.findAll(pageable);
        return result.map(x -> new EmpregosDTO(x));
    }

    @Transactional(readOnly = true)
    public EmpregosDTO findById(Long dto) {
        Empregos entity = repository.findById(dto).orElseThrow(() ->
                new RuntimeException("Recurso não encontrado..."));
        return new EmpregosDTO(entity);
    }

    @Transactional
    public EmpregosDTO insert(EmpregosDTO dto) {
        Empregos entity = new Empregos();

        entity.setDescricao(dto.getDescricao());
        entity.setNome(dto.getNome());

        for (CompetenciasDTO compAux : dto.getCompetencias()) {
            Competencias comp = new Competencias();
            comp.setId(compAux.getId());
            comp.setNome(compAux.getNome());
            entity.getCopetencias().add(comp);
        }

        try {
            entity = repository.save(entity);
            System.out.println("Salvo com sucesso");
        } catch (EmptyResultDataAccessException e) {
            // It's better to throw a more specific exception or create a custom exception
            throw new EntityNotFoundException("Erro ao salvar: ID não encontrado");
        } catch (Exception e) {
            // It's better to throw a more specific exception or create a custom exception
            throw new RuntimeException("Erro ao Salvar", e);
        }

        return new EmpregosDTO(entity);
    }


    public void delete(Long dto) {
        repository.deleteById(dto);
    }


    @Transactional
    public EmpregosDTO update(Long id, EmpregosDTO dto) {
        Empregos emp = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Empregos não encontrado com ID: " + id));
        copyToEntity(dto, emp);
        try {
            emp = repository.save(emp);
            System.out.println("Atualizado com sucesso");
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException("Erro ao atualizar: ID não encontrado");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao Atualizar", e);
        }

        return new EmpregosDTO(emp);
    }

    private void copyToEntity(EmpregosDTO dto, Empregos entity) {
        entity.setNome(dto.getNome());
        entity.setDescricao(dto.getDescricao());
        entity.getCopetencias().clear();

        for (CompetenciasDTO dtoaUX : dto.getCompetencias()) {
            Competencias comp = new Competencias();
            comp.setId(dtoaUX.getId());
            comp.setNome(dtoaUX.getNome());
            entity.getCopetencias().add(comp);
        }
    }


}
