package com.Bengonno.demGestionEvenements.repository;

import com.Bengonno.demGestionEvenements.model.EvenementModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<EvenementModel, Long> {
}
