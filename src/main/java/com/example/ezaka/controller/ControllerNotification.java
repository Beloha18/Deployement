package com.example.ezaka.controller;

import com.example.ezaka.dao.NotificationDao;
import com.example.ezaka.model.Notification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/notif")
@CrossOrigin
public class ControllerNotification {
    NotificationDao notificationDao=new NotificationDao();
    @PostMapping("/sendmessage")
    public ResponseEntity<Boolean> sendMessage(@RequestParam (name = "client_id_notif") String idclient, @RequestParam (name = "message") String enchere) throws Exception {
        Boolean testsendMessage = notificationDao.sendMessage(idclient,enchere);
        return ResponseEntity.ok(testsendMessage);
    }
    @GetMapping("/getMessage/{client}")
    public ResponseEntity<ArrayList<Notification>> getMessage(@PathVariable String client) throws Exception {
        ArrayList<Notification> notifications= notificationDao.getNotifparcl(client);
        return ResponseEntity.ok(notifications);
    }
}
