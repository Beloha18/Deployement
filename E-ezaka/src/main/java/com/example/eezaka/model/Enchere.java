package com.example.eezaka.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "enchere")
public class Enchere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String enchere_id;
    @Column(name = "enchere_name")
    public String enchere_name;
    @Column(name = "enchere_date")
    public String enchere_date;
    @Column(name = "enchere_desc")
    public String enchere_desc;
    @Column(name = "client_id_enchere")
    public int client_id_enchere;
    @Column(name = "enchere_prix_depart")
    public double enchere_prix_depart;
    @Column(name = "duree_id_enchere")
    public int duree_id_enchere;
    @Column(name = "enchere_status")
    public int enchere_status;

    public String getEnchere_id() {
        return enchere_id;
    }

    public void setEnchere_id(String enchere_id) {
        this.enchere_id = enchere_id;
    }

    public String getEnchere_name() {
        return enchere_name;
    }

    public void setEnchere_name(String enchere_name) {
        this.enchere_name = enchere_name;
    }

    public String getEnchere_date() {
        return enchere_date;
    }

    public void setEnchere_date(String enchere_date) {
        this.enchere_date = enchere_date;
    }

    public String getEnchere_desc() {
        return enchere_desc;
    }

    public void setEnchere_desc(String enchere_desc) {
        this.enchere_desc = enchere_desc;
    }

    public int getClient_id_enchere() {
        return client_id_enchere;
    }

    public void setClient_id_enchere(int client_id_enchere) {
        this.client_id_enchere = client_id_enchere;
    }

    public double getEnchere_prix_depart() {
        return enchere_prix_depart;
    }

    public void setEnchere_prix_depart(double enchere_prix_depart) {
        this.enchere_prix_depart = enchere_prix_depart;
    }

    public int getDuree_id_enchere() {
        return duree_id_enchere;
    }

    public void setDuree_id_enchere(int duree_id_enchere) {
        this.duree_id_enchere = duree_id_enchere;
    }

    public int getEnchere_status() {
        return enchere_status;
    }

    public void setEnchere_status(int enchere_status) {
        this.enchere_status = enchere_status;
    }
}
