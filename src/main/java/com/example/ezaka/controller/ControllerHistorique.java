package com.example.ezaka.controller;

import com.example.ezaka.dao.HistoriqueDao;
import com.example.ezaka.model.Historique;
import com.example.ezaka.dao.HistoriqueDao;
import com.example.ezaka.model.Historique;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/historique")
@CrossOrigin
public class ControllerHistorique {
    HistoriqueDao  historiqueDao=new HistoriqueDao();
    @GetMapping("/histoencours/{client}")
    public ResponseEntity<ArrayList<Historique>> getEnchereencoursBy(@PathVariable String client) throws Exception {
        ArrayList<Historique> historiques=historiqueDao.getEnchereOencoursf(client);
        return ResponseEntity.ok(historiques);
    }

    @GetMapping ("/histofait/{client}")
    public ResponseEntity<ArrayList<Historique>> getEncherefaitBy(@PathVariable String client) throws Exception {
        ArrayList<Historique> historiques=historiqueDao.getEncherefaitof(client);
        return ResponseEntity.ok(historiques);
    }
    @GetMapping ("/historiquetous/{client}")
    public ResponseEntity<ArrayList<Historique>> tousenchere(@PathVariable String client) throws Exception {
        ArrayList<Historique> historiques=historiqueDao.gettousenchere(client);
        return ResponseEntity.ok(historiques);
    }
}
