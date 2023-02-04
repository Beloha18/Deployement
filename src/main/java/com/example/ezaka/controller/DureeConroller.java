package com.example.ezaka.controller;

import com.example.ezaka.dao.DureeDao;
import com.example.ezaka.model.Duree;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class DureeConroller {
    @GetMapping("/getallduree")
    public ResponseEntity<ArrayList<Duree>> getall() throws Exception{
        ArrayList<Duree> duree= DureeDao.getallduree();
        return ResponseEntity.ok(duree);
    }
}
