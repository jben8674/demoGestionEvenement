package com.Bengonno.demGestionEvenements.controller;


import com.Bengonno.demGestionEvenements.model.UtilisateurModel;
import com.Bengonno.demGestionEvenements.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@AllArgsConstructor
@RestController
public class UtilisateurController {
    @Autowired
    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @PostMapping
    public UtilisateurModel SaveUtilisateur(@RequestBody UtilisateurModel utilisateur) {
        return utilisateurService.save(utilisateur);
    }
    @GetMapping("utilisateur/{id}")
    public Optional<UtilisateurModel> GetUtilisateurById(@RequestParam Long id) {
        return utilisateurService.findById(id);

    }
    @GetMapping("utilisateur/")
    public List<UtilisateurModel> GetUtilisateurFindAll() {
        return utilisateurService.findAll();

    }
    @PutMapping("utilisateur/{id}")
    public UtilisateurModel UpdateUtilisateur(@PathVariable Long id, @RequestBody UtilisateurModel utilisateur) {
      return utilisateur;
    }
    @DeleteMapping("utilisateur/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteById(id);
    }
}
