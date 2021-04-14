package com.corejava.training.java8project;

public class InterfaceDemo1 {

	 public static void main(String[] args) {
	        
	        //MaxFinderImpl maxFinder = new MaxFinderImpl();        
	        
	        MaxFinder maxFinder = new MaxFinder() {

	            @Override
	            public int max(int a, int b) {
	            
	                return a>b ? a:b;
	            }            
	        };        
	        
	        int max = maxFinder.max(25,10);
	        
	        System.out.println("Max : "+max);

	 }
	
}
