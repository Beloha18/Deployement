package com.mycompany.mavenproject1;

public class Proposition extends BDD{
    String client_id_prop;
    String enchere_id_prop;
    double rencherir;
    String prop_date;

    public String getClient_id_prop() {
        return client_id_prop;
    }

    public void setClient_id_prop(String client_id_prop) {
        this.client_id_prop = client_id_prop;
    }

    public String getEnchere_id_prop() {
        return enchere_id_prop;
    }

    public void setEnchere_id_prop(String enchere_id_prop) {
        this.enchere_id_prop = enchere_id_prop;
    }

    public double getRencherir() {
        return rencherir;
    }

    public void setRencherir(double rencherir) {
        this.rencherir = rencherir;
    }

    public String getProp_date() {
        return prop_date;
    }

    public void setProp_date(String prop_date) {
        this.prop_date = prop_date;
    }
    
    
}
