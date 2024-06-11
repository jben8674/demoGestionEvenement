package com.Bengonno.demGestionEvenements.service;

import com.Bengonno.demGestionEvenements.model.UtilisateurModel;
//import com.Bengonno.demGestionEvenements.repository.UtilisateurRepository;
import com.Bengonno.demGestionEvenements.repository.UtilisateuRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UtilisateurService {


   @Autowired
    private final UtilisateuRepository utilisateuRepository;

    public Optional<UtilisateurModel> findById(Long id) {
       return utilisateuRepository.findById(id);
   }

    public UtilisateurModel findByEmail(String email) {
        return utilisateuRepository.findByEmail(email);
    }

    public List<UtilisateurModel> findAll() {
        return utilisateuRepository.findAll();
    }

    public UtilisateurModel save(UtilisateurModel utilisateur) {
        return utilisateuRepository.save(utilisateur);
    }

    public void deleteById(Long id) {
        utilisateuRepository.deleteById(id);
    }

}
