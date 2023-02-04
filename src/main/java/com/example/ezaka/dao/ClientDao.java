package com.example.ezaka.dao;

import com.example.ezaka.Connection.Connexion;
import com.example.ezaka.model.Client;
import jakarta.persistence.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public class ClientDao {

    List<Client> getAllClient(){
        List<Client> clients=null;
        EntityManager entityManager = null;
        clients= entityManager.createNativeQuery("select * from client", Client.class)
                .getResultList();
        return clients;
    }
    public static String getbyId(String mail, String mdp) throws Exception {
        String id=null;
        Connection connectpg=null;
        Statement statement=null;
        Connexion con=new Connexion();
        ResultSet result=null;
        try{
            connectpg=con.getConnect();
            statement=connectpg.createStatement();
            String sql="SELECT client_id FROM client where client_email='"+mail+"' and client_mdp='"+mdp+"'";
            System.out.println(sql);
            result= statement.executeQuery(sql);

            while(result.next())
            {
                id= result.getString( "client_id");

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
        return id;
    }
    public static String getClient(String id) throws Exception {
        String c=null;
        Connection connectpg=null;
        Statement statement=null;
        Connexion con=new Connexion();
        ResultSet result=null;
        try{
            connectpg=con.getConnect();
            statement=connectpg.createStatement();
            String sql="SELECT * FROM client where client_id='"+id+"'";
            System.out.println(sql);
            result= statement.executeQuery(sql);

            while(result.next())
            {

                c=result.getString("client_name");


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
        return c;
    }
}
