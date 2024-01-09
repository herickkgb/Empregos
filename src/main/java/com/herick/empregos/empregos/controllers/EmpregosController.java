package com.herick.empregos.empregos.controllers;

import com.herick.empregos.empregos.dto.EmpregosDTO;
import com.herick.empregos.empregos.entities.Empregos;
import com.herick.empregos.empregos.servicies.EmpregosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/empregos")
public class EmpregosController {
    @Autowired
    private EmpregosService service;

    @GetMapping
    public ResponseEntity<Page<EmpregosDTO>> findAll(Pageable pageable) {
        Page<EmpregosDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<EmpregosDTO> findById(@PathVariable Long id) {
        EmpregosDTO entidade = service.findById(id);
        return ResponseEntity.ok(entidade);
    }


    @PostMapping
    public ResponseEntity<EmpregosDTO> insert(@RequestBody @Valid EmpregosDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @DeleteMapping("/{id}")
    public void excluirEntidade(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<EmpregosDTO> update(@PathVariable Long id, @Valid @RequestBody EmpregosDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }


}
