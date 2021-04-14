package com.corejava.training;

public class BankDemo {

	 public static void main(String[] args) {
	        
	        Bank bank = new Bank();
	        
	        double amount = 50000; // arg 2
	        
	        Account account2 = new Account(); // arg 1
	        account2.setAccno(101);
	        account2.setName("Raj");
	        account2.setBalance(4000);
	        
	        Account account1 = new Account(); // arg 1
	        account1.setAccno(102);
	        account1.setName("Rajesh");
	        account1.setBalance(40000);
	        System.out.println("Amount to credit :" + amount);
	        bank.deposit(account2, amount);
	        
	        System.out.println("After deposit: Balance "+ account2.getBalance());
	        
	        double with_amount = 100000;
	        System.out.println("Amount to withdraw :" + with_amount);
	        bank.withdraw(account2, with_amount);
	     
	        System.out.println("After withdraw: Balance "+ account2.getBalance());
	        
	        double trans_amt = 50000;
	        System.out.println("Amount to Transfer :" + trans_amt);
	        System.out.println("Before Transfer: Debit A/c Balance "+ account1.getBalance() + "\n\t\tCredit A/c Balance "+ account2.getBalance());
	        bank.transfer(account1 , account2, trans_amt);
	        System.out.println("After Transfer: Debit A/c Balance "+ account1.getBalance() + "\n\t\tCredit A/c Balance "+ account2.getBalance());
	    }

}
