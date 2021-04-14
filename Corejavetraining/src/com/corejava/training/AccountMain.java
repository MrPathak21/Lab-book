package com.corejava.training;

public class AccountMain {

	 

    public static void main(String[] args) {
   
        
        Account account1 = new Account();        
        account1.setAccno(1);
        account1.setBalance(5000);
        account1.setName("Arshita");
        
        System.out.println("Account Number :" + account1.getAccno());
        System.out.println("Account Name :" + account1.getName());
        System.out.println("Account Balance :" + account1.getBalance());


    }

 

}
