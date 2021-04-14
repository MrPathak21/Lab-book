package com.corejava.training.Exceptionhandling;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		 System.out.println("Main starts....");

		 

	        int a = 10;        
	        int b = 0;        
	        
	        try 
	        {
	        int c = a/b;        
	        System.out.println("Result: "+c);
	        }
	        
	        catch(Exception e)
	        {
	        	System.out.println("Exception has occured");
	        }
	        finally
	        {
	        System.out.println("Main ends....");
	        }
	}
}
