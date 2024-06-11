package com.Bengonno.demGestionEvenements.controller;


import com.Bengonno.demGestionEvenements.model.EvenementModel;
import com.Bengonno.demGestionEvenements.service.EvenementService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class EvenementController {
    @Autowired
    private EvenementService evenementService;

    @GetMapping("evenement/{id}")
    public EvenementModel getEvenementById(@RequestParam Long id) {
        return evenementService.findById(id);

    }
    @GetMapping("evenement/")
    public List<EvenementModel> getAllEvenements() {
        return evenementService.findAll();
    }
    @PostMapping("creeUnUtilisateur/")
    public EvenementModel saveEvenement(@RequestBody EvenementModel evenementModel) {
        return evenementService.save(evenementModel);
    }




}
