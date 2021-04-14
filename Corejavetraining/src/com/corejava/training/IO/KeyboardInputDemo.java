package com.corejava.training.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputDemo {
	
	 public static void main(String[] args) throws IOException {
	        
	        // step 1: open stream
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        
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
	        
	        //step 3: close the stream
	        br.close();
	        isr.close();        
	    }

}
