package com.corejava.training.inheritanceDemos;

public class Book {
	 private String isbn;
	    private String bookName;
	    private double price;    
	    private Author author;
	    
	    public Book(String isbn, String bookName, double price, Author author) {
			super();
			this.isbn = isbn;
			this.bookName = bookName;
			this.price = price;
			this.author = author;
		} 
	    
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Author getAuthor() {
			return author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		

}
