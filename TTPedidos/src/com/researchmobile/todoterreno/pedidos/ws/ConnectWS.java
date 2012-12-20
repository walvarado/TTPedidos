package com.researchmobile.todoterreno.pedidos.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class ConnectWS {

	private static String IP_SERVER = "174.129.97.85";
    private static int PUERTO = 80;
    
    public static JSONObject obtenerJson(String url) {            
        JSONObject jsonObject = null;
        try {
            URL urlCon = new URL("http", IP_SERVER, PUERTO, "/WS/" + url);
            HttpURLConnection urlConnection = (HttpURLConnection) urlCon.openConnection();
            System.out.println("Login - url = " + urlCon);
            InputStream inputStream = urlConnection.getInputStream();
            
            String responseInputStream = convertStreamToString(inputStream);
            System.out.println(responseInputStream);
            jsonObject = new JSONObject(responseInputStream);
        } catch (Exception exception) {
            System.out.println(exception);
            return jsonObject;
        }
        return jsonObject;
    }
    
    private static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder(); 
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

	
}

	

