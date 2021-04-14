package com.corejava.training.Collections;

public class EmployeeEqualsDemo {
	
	 public static void main(String[] args) {
	        
	        Employee emp1 = new Employee(101,"raj",250000);
	        Employee emp2 = new Employee(101,"raj",20000);
	        
	        System.out.println(emp1);
	        System.out.println(emp2);
	        
	        if(emp1.equals(emp2)) {
	            System.out.println("Both emp objects are equal");
	        }
	        else {
	            System.out.println("Both emp objects are not equal");
	        }
	    }

}
