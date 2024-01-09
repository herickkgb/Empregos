package com.herick.empregos.empregos.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Table(name = "tb_empregos")
@Entity
public class Empregos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;

    @ManyToMany(mappedBy = "empregos")
    @JsonManagedReference
    private Set<Competencias> competencias = new HashSet<>();

    public Empregos() {
    }

    public Empregos(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Competencias> getCopetencias() {
        return competencias;
    }

    public void setCopetencias(Set<Competencias> copetencias) {
        this.competencias = copetencias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empregos empregos)) return false;
        return Objects.equals(getId(), empregos.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
