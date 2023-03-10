package com.example.ezaka.dao;


import com.example.ezaka.Connection.Connexion;
import com.example.ezaka.bdd.BDD;
import com.example.ezaka.model.Duree;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DureeDao extends BDD {
    public static ArrayList<Duree> getallduree() throws Exception {
        ArrayList<Duree> duree=new ArrayList<Duree>();
        Connection connectpg=null;
        Statement statement=null;
        Connexion con=new Connexion();
        ResultSet result=null;
        try{
            connectpg=con.getConnect();
            statement=connectpg.createStatement();
            String sql="SELECT*FROM duree";
            result= statement.executeQuery(sql);
            while(result.next())
            {
                Duree dr=new Duree();
                dr.setDuree_id(result.getInt("duree_id"));
                dr.setDuree(result.getDouble("duree"));
                duree.add(dr);
            }
        }
        catch(Exception e)
        {
            throw e;
        }
        finally{
            if(!statement.isClosed()){
                statement.close();
            }
            if(!result.isClosed()){
                result.close();
            }
            if(!connectpg.isClosed()){
                connectpg.close();
            }
        }
        return duree;
    }
}
