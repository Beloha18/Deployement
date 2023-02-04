package com.example.ezaka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Portefeuille {
    public double getSolde(String client_id) {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getClient_id_trans() {
        return client_id_trans;
    }

    public void setClient_id_trans(String client_id_trans) {
        this.client_id_trans = client_id_trans;
    }

    double solde;
    String client_id_trans;
}
