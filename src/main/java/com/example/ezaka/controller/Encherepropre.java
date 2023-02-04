package com.example.ezaka.controller;

import com.example.ezaka.dao.EncherepropreDao;
import com.example.ezaka.model.Historique;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("propreenchere")
public class Encherepropre {
    EncherepropreDao encherepropre=new EncherepropreDao();
    @GetMapping("/propreencours/{client}")
    public ResponseEntity<ArrayList<Historique>> getEncherpren(@PathVariable String client) throws Exception {
        ArrayList<Historique> historiques=encherepropre.getEncherepropreencours(client);
        return ResponseEntity.ok(historiques);
    }
    @GetMapping("/proprefait/{client}")
    public ResponseEntity<ArrayList<Historique>> getEncherfait(@PathVariable String client) throws Exception {
        ArrayList<Historique> historiques=encherepropre.getEnchereproprefait(client);
        return ResponseEntity.ok(historiques);
    }

}
