package com.mycompany.mavenproject1;



import java.sql.Timestamp;

public class Enchere extends BDD{
    public String enchere_id;
    public String enchere_name;
    public Timestamp enchere_date;
    public String enchere_desc;
    public String client_id_enchere;
    public double enchere_prix_depart;
    public int duree_id_enchere;
    public int enchere_status;

    public Enchere() {
    }

    public Enchere(String enchere_id, String enchere_name, Timestamp enchere_date, String enchere_desc, String client_id_enchere, double enchere_prix_depart, int duree_id_enchere, int enchere_status) {
        this.enchere_id = enchere_id;
        this.enchere_name = enchere_name;
        this.enchere_date = enchere_date;
        this.enchere_desc = enchere_desc;
        this.client_id_enchere = client_id_enchere;
        this.enchere_prix_depart = enchere_prix_depart;
        this.duree_id_enchere = duree_id_enchere;
        this.enchere_status = enchere_status;
    }

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

    public Timestamp getEnchere_date() {
        return enchere_date;
    }

    public void setEnchere_date(Timestamp enchere_date) {
        this.enchere_date = enchere_date;
    }

    public String getEnchere_desc() {
        return enchere_desc;
    }

    public void setEnchere_desc(String enchere_desc) {
        this.enchere_desc = enchere_desc;
    }

    public String getClient_id_enchere() {
        return client_id_enchere;
    }

    public void setClient_id_enchere(String client_id_enchere) {
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
