package com.example.eezaka.service;

import com.example.eezaka.model.Utilisateur;
import com.example.eezaka.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    public Utilisateur registreUtilisateur(Utilisateur utilisateur){
        return utilisateurRepository.save(utilisateur);
    }
}
