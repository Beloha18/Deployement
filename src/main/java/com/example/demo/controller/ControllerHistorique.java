package com.example.demo.controller;

import com.example.demo.dao.HistoriqueDao;
import com.example.demo.model.Historique;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/historique")
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
