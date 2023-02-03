package com.example.ezaka.controller;

import com.example.ezaka.model.Utilisateur;
import com.example.ezaka.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enregistrer")
@CrossOrigin
public class InscriptionController {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @PostMapping("/enregistrer")
    public String register( @RequestBody Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
        return "succes";
    }
}
