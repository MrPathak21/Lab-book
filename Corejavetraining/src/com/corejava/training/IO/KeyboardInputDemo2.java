package com.corejava.training.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputDemo2 {
	
	 public static void main(String[] args) throws IOException {
	        
		 InputStreamReader isr = null;
	        BufferedReader br= null;    
	        
	        try {
	            // step 1: open stream
	            isr = new InputStreamReader(System.in);            
	            br = new BufferedReader(isr);    
	            
	            //step 2: perform IO operation
	            System.out.println("Enter name:");
	            String name=  br.readLine();
	            
	            System.out.println("Enter number:");        
	            int empno = Integer.parseInt(br.readLine());
	            
	            System.out.println("Enter salary:");        
	            double salary = Double.parseDouble(br.readLine());
	            
	            System.out.println("Empno: "+empno);
	            System.out.println("Name: "+name);        
	            System.out.println("Salary: "+salary);
	        }
	        catch(IOException e) {
	            e.printStackTrace();
	        }
	        finally {
	            //step 3: close the stream
	            try {
	                br.close();
	                isr.close();
	            }
	            catch(IOException e) {
	                e.printStackTrace();
	            }                
	        }           
	    }

}
