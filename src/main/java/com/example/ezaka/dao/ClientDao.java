package com.example.ezaka.dao;

import com.example.ezaka.model.Client;
import jakarta.persistence.*;
import java.util.List;

public class ClientDao {

    List<Client> getAllClient(){
        List<Client> clients=null;
        EntityManager entityManager = null;
        clients= entityManager.createNativeQuery("select * from client", Client.class)
                .getResultList();
        return clients;
    }
}
