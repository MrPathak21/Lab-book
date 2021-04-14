package com.corejava.training.regex;

import java.util.regex.*;

public class UserService {
	public void registerUser(String username, String password, int age, String email, String mobile) {

		 

        // validate the data
        
        boolean result = validate(username,password,age,email,mobile);
        
        if(result) 
        {    
            // if it is valid data then create object of user
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setAge(age);
            user.setEmail(email);
            user.setMobile(mobile);
            System.out.println("Registration success");
        }
        else 
        {
            System.out.println("Registration Failed");
        }
    }
    
    boolean validate(String username, String password, int age, String email, String mobile) {
        
        boolean userNamePattern = Pattern.matches("[a-zA-Z0-9]{6,12}", username);
        
        if(!userNamePattern) {
            System.out.println("Username should be Alpha numeric and between 6 to 12 chars");
        }
        
        boolean agePattern = Pattern.matches("[0-9]{1,2}", age+"");
        if(!agePattern) {
            System.out.println("Age should be between 1-100 ");
        }
        boolean passwordPattern = Pattern.matches("[a-zA-Z0-9@_]{8,12}", password);
        
        if(!passwordPattern) {
            System.out.println("Password should be Alpha numeric with special characters(@ or _) and between 8 to 12 chars");
        }
        
        
        boolean emailPattern = Pattern.matches("^(.+)@(.+)$", email);
        
        if(!emailPattern) {
            System.out.println("Invalid Email");
        }
        
        boolean mobilePattern = Pattern.matches("[6789][0-9]{9}", mobile);
        
        if(!mobilePattern) {
            System.out.println("Mobile number should be of 10 digits starting with 6,7,8 or 9");
        }
        if(userNamePattern && emailPattern && agePattern && mobilePattern && passwordPattern) {
            return true;
        }
        
        return false;

   }
}
