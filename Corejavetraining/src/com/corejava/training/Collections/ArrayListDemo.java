package com.corejava.training.Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	   public static void main(String[] args) {
	        
	        ArrayList<String> courses = new ArrayList<String>();
	        System.out.println("size: "+courses.size());
	        
	        courses.add("java");
	        courses.add("Sql");
	        courses.add("Hibernate");
	        
	        System.out.println("size: "+courses.size());
	        System.out.println(courses);
	        
	        courses.add(1,"spring");    
	        courses.add(2,"java");
	        
	        System.out.println(courses);    
	        
	    }

}
