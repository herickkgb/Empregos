package com.herick.empregos.empregos.dto;

import com.herick.empregos.empregos.entities.Competencias;

import com.herick.empregos.empregos.entities.Empregos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

public class EmpregosDTO {

    private Long id;
    private String nome;
    private String descricao;

    private Set<CompetenciasDTO> competencias = new HashSet<>();


    public EmpregosDTO(Empregos entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.descricao = entity.getDescricao();
        for (Competencias entityAux : entity.getCopetencias()) {
            competencias.add(new CompetenciasDTO(entityAux));
        }
    }

    public EmpregosDTO(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<CompetenciasDTO> getCompetencias() {
        return competencias;
    }

}
