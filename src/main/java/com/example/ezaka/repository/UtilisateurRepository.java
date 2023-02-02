package com.example.ezaka.repository;

import com.example.ezaka.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,String> {
}
