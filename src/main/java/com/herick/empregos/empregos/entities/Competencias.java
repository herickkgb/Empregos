package com.herick.empregos.empregos.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Table(name = "tb_competencias")
@Entity
public class Competencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany
    @JoinTable(name = "tb_empregos_competencias",
            joinColumns = @JoinColumn(name = "emprego_id"),
            inverseJoinColumns = @JoinColumn(name = "competencias_id"))
    @JsonBackReference
    private Set<Empregos> empregos = new HashSet<>();

    public Competencias() {
    }

    public Competencias(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public Set<Empregos> getEmpregos() {
        return empregos;
    }

    public void setEmpregos(Set<Empregos> empregos) {
        this.empregos = empregos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Competencias competencias)) return false;
        return Objects.equals(getId(), competencias.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
