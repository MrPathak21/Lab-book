package com.corejava.training.inheritanceDemos;

public class Author {

	 private String authorName;
	 private String email;
	
	 public Author(String authorName, String email) 
	 {
			super();
			this.authorName = authorName;
			this.email = email;
	}
	 public String getAuthorName()
	 {
			return authorName;
   	 }
	public void setAuthorName(String authorName) 
	{
			this.authorName = authorName;
	}
	public String getEmail() 
	{
			return email;
	}
	public void setEmail(String email) 
	{
			this.email = email;
	}  
	    
	    
}
