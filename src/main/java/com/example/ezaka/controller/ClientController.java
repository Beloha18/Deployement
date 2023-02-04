package com.example.ezaka.controller;

import com.example.ezaka.dao.ClientDao;
import com.example.ezaka.model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/Client")
public class ClientController {
    @PostMapping("/loginfrontoff")
    public boolean logAdmin(@RequestParam(name = "client_email") String email, @RequestParam(name = "client_mdp") String mdp) throws Exception {
        Client a =new Client();
        boolean b = a.login(email, mdp);
        return b;
    }
    @PostMapping("/getid")
    public ResponseEntity<String> getid(@RequestParam(name = "client_email") String mail, @RequestParam(name = "client_mdp") String mdp) throws Exception {
        String id= ClientDao.getbyId(mail,mdp);
        return ResponseEntity.ok(id);
    }
    @GetMapping("/getClient/{client_id}")
    public ResponseEntity<String> getClient(@PathVariable(name = "client_id") String client_id) throws Exception {
        String c=ClientDao.getClient(client_id);
        return ResponseEntity.ok(c);
    }

}


