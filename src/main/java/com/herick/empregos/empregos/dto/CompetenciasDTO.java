package com.herick.empregos.empregos.dto;

import com.herick.empregos.empregos.entities.Competencias;
import com.herick.empregos.empregos.entities.Empregos;

import java.util.HashSet;
import java.util.Set;

public class CompetenciasDTO {

    private Long id;
    private String nome;

    public CompetenciasDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CompetenciasDTO(Competencias entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
