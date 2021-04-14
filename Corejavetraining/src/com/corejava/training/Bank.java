package com.corejava.training;

public class Bank {

	 

    public void deposit(Account account,double amount ) {
        
        double currentBal = account.getBalance();        
        double updatedBal = currentBal + amount;        
        account.setBalance(updatedBal);
    }
    
    public void withdraw(Account account,double balance) {
        
    	 double currentBal = account.getBalance();
    	 if(balance > currentBal)
    		 System.out.println("Insufficient amount in the Account to withdraw!!");
    	 else
             {
    		 double updatedBal = currentBal - balance;        
             account.setBalance(updatedBal);
             }
    }
    public void transfer(Account from_acc,Account to_acc, double trans_amt)
    {
    	double currentBal1 = from_acc.getBalance();
    	double currentBal2 = to_acc.getBalance();
    	 if(trans_amt > currentBal1)
    		 System.out.println("Insufficient Balance!! You cannont Transfer the money.");
    	 else
    	 {	 
        double updatedBal1 = currentBal1 - trans_amt;        
        from_acc.setBalance(updatedBal1);
        double updatedBal2 = currentBal2 + trans_amt;
        to_acc.setBalance(updatedBal2);
    	 }
    }
    
//    String add(String s1, String s2) {        
//        String s3 = s1+s2;
//        return s3;
//    }
//    
//    int findLength(String s) {        
//        int len = s.length();
//        return len;
//    }
}
