package com.mycompany.mavenproject1;

public class Recharge{
    int recharge_id;
    String client_id_recharge;
    double recharge_montant;
    String recharge_date;
    int recharge_etat;

    public Recharge() {
    }

    public Recharge(int recharge_id, String client_id_recharge, double recharge_montant, String recharge_date, int recharge_etat) {
        this.recharge_id = recharge_id;
        this.client_id_recharge = client_id_recharge;
        this.recharge_montant = recharge_montant;
        this.recharge_date = recharge_date;
        this.recharge_etat = recharge_etat;
    }

    
    
    public int getRecharge_id() {
        return recharge_id;
    }

    public void setRecharge_id(int recharge_id) {
        this.recharge_id = recharge_id;
    }

    public String getClient_id_recharge() {
        return client_id_recharge;
    }

    public void setClient_id_recharge(String client_id_recharge) {
        this.client_id_recharge = client_id_recharge;
    }

    public double getRecharge_montant() {
        return recharge_montant;
    }

    public void setRecharge_montant(double recharge_montant) {
        this.recharge_montant = recharge_montant;
    }

    public String getRecharge_date() {
        return recharge_date;
    }

    public void setRecharge_date(String recharge_date) {
        this.recharge_date = recharge_date;
    }

    public int getRecharge_etat() {
        return recharge_etat;
    }

    public void setRecharge_etat(int recharge_etat) {
        this.recharge_etat = recharge_etat;
    }
    
    
}
