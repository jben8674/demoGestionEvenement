package com.Bengonno.demGestionEvenements.repository;

import com.Bengonno.demGestionEvenements.model.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel, Long> {
    ReservationModel findByEmail(String email);
}
