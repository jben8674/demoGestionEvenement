package com.Bengonno.demGestionEvenements.controller;


import com.Bengonno.demGestionEvenements.model.ReservationModel;
import com.Bengonno.demGestionEvenements.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

            @PostMapping("reservation/")
            public ReservationModel Save(@RequestBody ReservationModel reservationModel) {
             return reservationService.save( reservationModel);

            }
            @GetMapping("resrvation/")
            public List<ReservationModel> findAll() {
            return reservationService.findAll();
            }
            @GetMapping("reservation/{id}")
            public Optional<ReservationModel> findById(@RequestParam Long id) {
            return reservationService.findById(id);
            }
            @DeleteMapping("reservation/")
            public void deleteById(@RequestBody Long id) {
              reservationService.deleteById(id);

            }
            @GetMapping("reservation/{email}")
            public ReservationModel findByEmail(@RequestParam String email) {
        return reservationService.findByEmail(email);

            }
            @PutMapping("reservation/{id}")
            public ReservationModel Update(@PathVariable Long id,@RequestBody ReservationModel reservationModel){
                return reservationService.updateReservation(id,reservationModel);

            }
}

