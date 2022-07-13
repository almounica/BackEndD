package com.iiht.training.elibrary.model;

public class Book {
    private String title;
    private String author;
    private int totalpages;
    private int isbn;
    public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getTotalpages() {
		return totalpages;
	}


	public void setTotalpages(int totalpages) {
		this.totalpages = totalpages;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public Book(String title,String author,int totalpages,int isbn) {
    	this.setTitle(title);
    	this.setAuthor(author);
    	this.setTotalpages(totalpages);
    	this.setIsbn(isbn);}
    	public String toString()
    	{
    	    return  "\nTitle: " + this.getTitle() + "\tAuthor: " +this.getAuthor() + "\tToatalpages: " + this.getTotalpages()+ "\tISBN: " + this.getIsbn();
    	}
    
}
