package com.example.ezaka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.example.ezaka.bdd.BDD;

import java.sql.ResultSet;
import java.sql.SQLException;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Client extends BDD {


    String client_id;

    String client_email;

    String client_mdp;

    String client_name;

    String client_forname;

    String client_num;

    String client_dtn;


    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_mdp() {
        return client_mdp;
    }

    public void setClient_mdp(String client_mdp) {
        this.client_mdp = client_mdp;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_forname() {
        return client_forname;
    }

    public void setClient_forname(String client_forname) {
        this.client_forname = client_forname;
    }

    public String getClient_num() {
        return client_num;
    }

    public void setClient_num(String client_num) {
        this.client_num = client_num;
    }

    public String getClient_dtn() {
        return client_dtn;
    }

    public void setClient_dtn(String client_dtn) {
        this.client_dtn = client_dtn;
    }

    public boolean login(String email,String mdp) throws SQLException,Exception{

        boolean val = false;
        String sql = "select * from Client where client_email='"+email+"' and client_mdp='"+mdp+"'";
        ResultSet res = response(sql);
        int nnbr = 0;
        while(res.next()){
            nnbr++;
        }
        if (nnbr!=0){
            val = true;
        }

        return val;
    }
}
