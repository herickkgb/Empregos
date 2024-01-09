package com.herick.empregos.empregos.repositories;

import com.herick.empregos.empregos.entities.Empregos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregosRepository extends JpaRepository<Empregos, Long> {
}
