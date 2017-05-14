/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soec;

import gui.gui_search_booking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import static javafx.css.StyleOrigin.USER_AGENT;
import org.json.*;
/**
 *
 * @author simon
 */
public class Soec {
     
private final String USER_AGENT = "Mozilla/5.0";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /**java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_search_booking().setVisible(true);
            }
        });
        */
        
        Soec http = new Soec();
        System.out.println("Testing 1 - Send Http GET request");
		http.getOdata();
    }
    
    private void getOdata() throws Exception {
       
        
        String url = "http://services.odata.org/V4/TripPinServiceRW/People";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
                con.setRequestProperty("accept", "application/json");
                
                //add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
                        
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
/**
		//print result
		System.out.println(response.toString());
                System.out.println(response);
                JSONObject objext = new JSONObject(response);
                
                String pageName = objext.getString("Address");
                System.out.println(pageName);
                JSONArray arr = objext.getJSONArray("AddressInfo");
            for (int i = 0; i < arr.length(); i++)
            {
               String pageName = arr.getJSONObject(i).getString("Address");
               System.out.println(pageName);
            }
            */
               
    }
    
    
    private void sendGet() throws Exception {
       
        
        String url = "http://www.google.com/search?q=mkyong";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
                
                //add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
        
        
    }
    
}
