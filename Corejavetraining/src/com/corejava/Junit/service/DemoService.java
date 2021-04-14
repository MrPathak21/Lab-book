package com.corejava.Junit.service;

import java.util.Arrays;

public class DemoService {

	 public boolean isPrime(int num) {
	       int flag = 1;
		 for(int j=2;j<=Math.sqrt(num);j++)
		 {
			 if(num%j == 0)
			 { 
				 flag=0;
			     break;
			 }
		 }
	     if(flag == 1)
	    	 return true;
	     else
	    	 return false;
		 
	    }
	    
	    public int[] sortArray(int[] arry) {
	    	Arrays.sort(arry);
	    	
	        return arry;        
	    }
	    
	    public boolean isPalindrome(String inputStr) {
	        String revStr ="";    
	        
	          for ( int i = inputStr.length() - 1; i >= 0; i--)  {
	              revStr = revStr + inputStr.charAt(i);    
	          }              
	          if (inputStr.equals(revStr))  
	            return true;
	          else  
	            return false;          
	    }
	
}
