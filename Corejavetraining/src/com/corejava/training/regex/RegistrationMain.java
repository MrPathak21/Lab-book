package com.corejava.training.regex;

import java.util.Scanner;

public class RegistrationMain {

		 public static void main(String[] args) {
		        
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter username");
		        String username = sc.next();
		        System.out.println("Enter password");
		        String password = sc.next();
		        System.out.println("Enter age");
		        int age = sc.nextInt();
		        System.out.println("Enter email");
		        String email = sc.next();
		        System.out.println("Enter mobile");
		        String mobile = sc.next();
		        
		        sc.close();
		        
		        UserService userService = new UserService();
		        
		        userService.registerUser(username,password,age,email,mobile);

		 
	}

}
