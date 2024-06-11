package com.Bengonno.demGestionEvenements.service;

import com.Bengonno.demGestionEvenements.model.EvenementModel;
import com.Bengonno.demGestionEvenements.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {
    @Autowired
    private EvenementRepository evenementRepository;

    public List<EvenementModel> findAll() {
        return evenementRepository.findAll();

    }
    public EvenementModel findById(Long id) {
        return evenementRepository.findById(id).get();
    }
public EvenementModel save(EvenementModel evenement) {
        return evenementRepository.save(evenement);

}
public void delete(Long id) {
        evenementRepository.deleteById(id);
}

}
