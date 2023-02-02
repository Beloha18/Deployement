package com.example.ezaka.controller;

import com.example.ezaka.model.Utilisateur;
import com.example.ezaka.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enregistrer")
public class InscriptionController {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @PostMapping("/enregistrer")
    public String register( @RequestBody Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
        return "succes";
    }
}
