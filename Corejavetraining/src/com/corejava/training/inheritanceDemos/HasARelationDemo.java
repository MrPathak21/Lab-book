package com.corejava.training.inheritanceDemos;

public class HasARelationDemo {
	
	 public static void main(String[] args) {
	        
	        Author author = new Author("John","john@tmail.com");
	        
	        
	        Book book = new Book("B101","Java In Action",800,author);
	        
	        System.out.println("book details");
	        
	        System.out.println("ISBN: "+book.getIsbn());
	        System.out.println("Name: "+book.getBookName());
	        System.out.println("ISBN: "+book.getPrice());
	        //System.out.println("author: "+book.getAuthor());
	        
	        Author bookAuthor = book.getAuthor();
	        
	        System.out.println("author name: "+bookAuthor.getAuthorName());
	        System.out.println("author email: "+bookAuthor.getEmail());    
	        

	 

	    }

}
