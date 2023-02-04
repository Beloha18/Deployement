package com.example.ezaka.controller;

import com.example.ezaka.dao.PortefeuilleDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/Solde")
public class SoldeController{
    PortefeuilleDAO portefeuille = new PortefeuilleDAO();
    @GetMapping("/{client_id}")
    public ResponseEntity<Double> getSolde(@PathVariable String client_id) throws Exception {
        double solde = portefeuille.getSoldeof(client_id);
        return ResponseEntity.ok(solde);
    }
}
