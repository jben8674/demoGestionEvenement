package com.Bengonno.demGestionEvenements.service;

import com.Bengonno.demGestionEvenements.model.ReservationModel;
import com.Bengonno.demGestionEvenements.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationModel save(ReservationModel reservation) {
        return reservationRepository.save(reservation);
    }

    public Optional<ReservationModel> findById(Long id) {
        return reservationRepository.findById(id);
    }

    public List<ReservationModel> findAll() {
        return reservationRepository.findAll();
    }

    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    public ReservationModel findByEmail(String email) {
        return reservationRepository.findByEmail(email);
    }

    public ReservationModel updateReservation(Long id, ReservationModel reservation) {
        Optional<ReservationModel> reservationModelToUpdate = reservationRepository.findById(id);
        if (reservationModelToUpdate.isPresent()) {
            ReservationModel updatedReservation = reservationModelToUpdate.get();
            updatedReservation.setReservationName(reservation.getReservationName());
            updatedReservation.setReservationLieu(reservation.getReservationLieu());
            updatedReservation.setReservationDate(reservation.getReservationDate());
            return reservationRepository.save(updatedReservation);
        }
        return null;
    }
}
