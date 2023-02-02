package com.example.ezaka.model;

import com.example.ezaka.bdd.BDD;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recharge extends BDD {
    int recharge_id;
    String client_id_recharge;
    double recharge_montant;
    String recharge_date;
    int recharge_etat;
}
