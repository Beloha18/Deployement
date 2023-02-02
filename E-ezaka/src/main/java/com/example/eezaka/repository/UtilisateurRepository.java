package com.example.eezaka.repository;

import com.example.eezaka.model.Utilisateur;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,String> {
}

