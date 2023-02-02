package com.example.eezaka.controller;

import com.example.eezaka.model.Enchere;
import com.example.eezaka.model.Utilisateur;
import com.example.eezaka.repository.AjoutEnchere;
import com.example.eezaka.repository.UtilisateurRepository;
import com.example.eezaka.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enregistrer")
public class NewEnchereController{
    @Autowired
    AjoutEnchere ajoutEnchereRepo;
    @PostMapping("/enregistrerenchere")
    public String registerenchere( @RequestBody Enchere enchere) {
        ajoutEnchereRepo.save(enchere);
        return "succes";
    }
}
