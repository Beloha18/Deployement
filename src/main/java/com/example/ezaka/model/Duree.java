package com.example.ezaka.model;

import com.example.ezaka.bdd.BDD;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
public class Duree extends BDD {
    int duree_id;
    double duree;

    public Duree(){}
    public Duree(int id,double duree){
        this.duree_id=id;
        this.duree=duree;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public int getDuree_id() {
        return duree_id;
    }

    public void setDuree_id(int duree_id) {
        this.duree_id = duree_id;
    }

    public void insertduree(double duree){
        String req = "insert into Duree(duree) values('"+duree+"')";
        confirme(req);
    }
}
