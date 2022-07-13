package com.iiht.training.elibrary.model;

public class BookIssue {
	 String title;
    String author;
     int totalpages;
    int isbn;  
    public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getTotalpages() {
		return totalpages;
	}

	public int getIsbn() {
		return isbn;
	}

	public BookIssue(String title,String author,int totalpages,int isbn) {
    	this.title= title;
    	this.author=author;
    	this.totalpages=totalpages;
    	this.isbn=isbn;
    }
	public String toString()
	{
	    return  "\nTitle: " + this.getTitle() + "\tAuthor: " +this.getAuthor() + "\tToatalpages: " + this.getTotalpages()+ "\tISBN: " + this.getIsbn();
	}

}
