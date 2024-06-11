package com.Bengonno.demGestionEvenements.repository;

import com.Bengonno.demGestionEvenements.model.UtilisateurModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateuRepository extends JpaRepository<UtilisateurModel, Long> {
    UtilisateurModel findByEmail(String email);
}
