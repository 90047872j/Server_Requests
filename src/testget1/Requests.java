/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testget1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Juan
 */
public class Requests extends Thread {
    
   
public static void getRequests() {

        try {
            int count=0; 
            URL url = new URL("http://90047872j.github.io");
            URLConnection con = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                count++;
//                System.out.println(line);
                System.out.println(count);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
      long startTime, finishTime, totalTime;
      startTime= System.currentTimeMillis();
      getRequests();
      finishTime = System.currentTimeMillis();
      totalTime = finishTime -startTime;
      System.out.println("The request has taken " + totalTime + " milliseconds");
      
     }
}
