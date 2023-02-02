package com.example.eezaka.controller;

import com.example.eezaka.model.Utilisateur;
import com.example.eezaka.repository.UtilisateurRepository;
import com.example.eezaka.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enregistrer")
public class InscriptionController{
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @PostMapping("/enregistrer")
    public String register( @RequestBody Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
        return "succes";
    }
}
