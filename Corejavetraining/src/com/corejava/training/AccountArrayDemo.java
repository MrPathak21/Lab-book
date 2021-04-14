package com.corejava.training;

public class AccountArrayDemo {

	public static void main(String[] args) 
	{
		        
		        Account account1 = new Account();
		        account1.setAccno(101);
		        account1.setName("raj");
		        account1.setBalance(50000);
		        
		        Account account2 = new Account();
		        account2.setAccno(102);
		        account2.setName("krish");
		        account2.setBalance(60000);
		        
		        Account account3 = new Account();
		        account3.setAccno(103);
		        account3.setName("sam");
		        account3.setBalance(45000);        
		    
		        Account[] accounts = new Account[3];        
		        accounts[0] = account1;
		        accounts[1] = account2;
		        accounts[2] = account3;
		        
		        for(int i=0;i<accounts.length;i++)
		        {
		            Account acc = accounts[i];
		            System.out.println(acc.getAccno()+" "+acc.getName()+" "+acc.getBalance());
		        }    

	}

}
