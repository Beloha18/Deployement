package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import wiremock.com.fasterxml.jackson.core.type.TypeReference;
import wiremock.com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author P14B-81-Tahiry
 */
public class CallAPI {

    public boolean loginAdmin(String email, String mdp) throws Exception {
        URL url = new URL("http://localhost:8080/Admin/loginbackoff?admin_email=" + email + "&admin_mdp=" + mdp);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return Boolean.parseBoolean(response.toString());
        } else {
            throw new Exception("Error calling API, response code: " + responseCode);
        }
    }

    public ArrayList<Enchere> getAllEnchere() throws IOException {
        ArrayList<Enchere> ret = new ArrayList<Enchere>();
        String API_URL = "http://localhost:8080/enchere/listenchere";
        URL url = new URL(API_URL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("HTTP Error : " + status);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        ret = objectMapper.readValue(content.toString(), new TypeReference<ArrayList<Enchere>>() {
        });
        con.disconnect();
        return ret;
    }

    public ArrayList<Recharge> liste_recharger(String etat) throws IOException {
        ArrayList<Recharge> ret = new ArrayList<>();
        String API_URL = "http://localhost:8080/recharge/liste_recharger/" + etat;
        HttpURLConnection con = null;
        BufferedReader br = null;
        URL url = new URL(API_URL);
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("HTTP Error : " + status);
        }

        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String jsonString = br.readLine();
        ObjectMapper objectMapper = new ObjectMapper();
        ret = objectMapper.readValue(jsonString, new TypeReference<ArrayList<Recharge>>() {
        });
        return ret;
    }

    public boolean confirm(String id_recharge, String id_client, String montant) throws Exception {
        URL url = new URL("http://localhost:8080/recharge/confirm/" + id_recharge + "/" + id_client + "/" + montant);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return Boolean.parseBoolean(response.toString());
        } else {
            throw new Exception("Error calling API, response code: " + responseCode);
        }
    }

    public boolean decline(String id_recharge) throws Exception {
        URL url = new URL("http://localhost:8080/recharge/decline/" + id_recharge);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return Boolean.parseBoolean(response.toString());
        } else {
            throw new Exception("Error calling API, response code: " + responseCode);
        }
    }

    public void insertdurre(String categorie) {
        try {
            String url = "http://localhost:8080/Admin/insertdurre?durre=" + categorie;

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("API response: " + response.toString());
            } else {
                throw new Exception("Error calling API, response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertCategorie(String categorie) {
        try {
            String url = "http://localhost:8080/Admin/insertcatecorie?categorie=" + categorie;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("API response: " + response.toString());
            } else {
                throw new Exception("Error calling API, response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Proposition> getPropositionsOf(String id) throws IOException {
        ArrayList<Proposition> ret = new ArrayList<>();
        String API_URL = "http://localhost:8080/propos/getpropof/"+id;
        HttpURLConnection con = null;
        BufferedReader br = null;
        URL url = new URL(API_URL);
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("HTTP Error : " + status);
        }

        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String jsonString = br.readLine();
        ObjectMapper objectMapper = new ObjectMapper();
        ret = objectMapper.readValue(jsonString, new TypeReference<ArrayList<Proposition>>() {
        });
        return ret;
    }
}
