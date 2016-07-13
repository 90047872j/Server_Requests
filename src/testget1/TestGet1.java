/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testget1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Juan Tavera
 */
public class TestGet1 extends Thread {

    public static void main(String[] args) {
//
//        boolean x = true;
//        int cont = 0;
//
//        do {
//            if (cont == 10) {
//            x = false;    
//            }
//            getRequests();
//            cont++;
//            System.out.println("\nRequest "+cont+"\n");
//        } while (x == true);

        
        
        
          long startTime, finishTime;      
        
//        Requests request1 = new Requests();
//        Requests request2 = new Requests();
//        Requests request3 = new Requests();
//        Requests request4 = new Requests();
//        Requests request5 = new Requests();
//        

//        
//        startTime = System.currentTimeMillis();
//        request1.start();
//        finishTime = System.currentTimeMillis();
//        System.out.println("request num: "+request1.getId()+" start time "+startTime+ " finish time "+ finishTime);
//        
//        startTime = System.currentTimeMillis();
//        request2.start();
//        finishTime = System.currentTimeMillis();
//        System.out.println("request num: "+request2.getId()+" start time "+startTime+ " finish time "+ finishTime);
//        
//        startTime = System.currentTimeMillis();
//        request3.start();
//        finishTime = System.currentTimeMillis();
//        System.out.println("request num: "+request3.getId()+" start time "+startTime+ " finish time "+ finishTime);
//        
//        startTime = System.currentTimeMillis();
//        request4.start();
//        finishTime = System.currentTimeMillis();
//        System.out.println("request num: "+request4.getId()+" start time "+startTime+ " finish time "+ finishTime);
//        
//        startTime = System.currentTimeMillis();
//        request5.start();
//        finishTime = System.currentTimeMillis();
//        System.out.println("request num: "+request5.getId()+" start time "+startTime+ " finish time "+ finishTime);
        
        
        
       int nReq = reqNumber("Enter integer number of requests: ");
       Requests[] tReq = new Requests[nReq]; 
       
        for (int i = 0; i < nReq; i++) {
            
            Requests request = new Requests();
            tReq[i]= request;
            startTime = System.currentTimeMillis();
            request.start();
            finishTime = System.currentTimeMillis();
            System.out.println("Request # "+i+" start time "+startTime+ " finish time "+ finishTime);
            
            
        }
       
    }

    
    public static int reqNumber(String msg) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean error;
        
        do {
            try {
                System.out.print(msg);
                num = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.err.println("Imput/Output error");
                error = true;
            } catch (NumberFormatException ex) {
                System.err.println("You must enter a number");
                error = true;
            }
        } while (error);
        return num;
    }
    
}
    
    
    
    
 