package com.example.ezaka.dao;

import com.example.ezaka.Connection.Connexion;
import com.example.ezaka.model.Portefeuille;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PortefeuilleDAO {
    public double getSoldeof(String client_id) throws Exception {
        double nombre = 0;
        Portefeuille portefeuille=null;
        Connection connectpg=null;
        Statement statement=null;
        Connexion con=new Connexion();
        ResultSet result=null;
        try{
            connectpg=con.getConnect();
            statement=connectpg.createStatement();
            String sql="SELECT solde FROM portefeuille where client_id_trans='"+client_id+"';";
            System.out.println(sql);
            result= statement.executeQuery(sql);
            while(result.next())
            {
                nombre=result.getDouble("solde");
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
        return nombre;
    }
}
