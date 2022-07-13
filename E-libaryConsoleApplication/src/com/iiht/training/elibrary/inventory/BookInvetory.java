package com.iiht.training.elibrary.inventory;

import java.util.List;
import java.util.Scanner;

import com.iiht.training.elibrary.exception.BookAlreadyIssuedException;
import com.iiht.training.elibrary.exception.ISBNAlreadyExistsException;
import com.iiht.training.elibrary.exception.ISBNDoesNotExistsException;
import com.iiht.training.elibrary.model.Book;
import com.iiht.training.elibrary.model.BookIssue;

public class BookInvetory {
	public static void addISBN(List<Book> b, int n) throws ISBNAlreadyExistsException 
	{
		Scanner sc=new Scanner(System.in);
		for(int i =0;i<n;i++)
		{		
			System.out.println("Enter ISBN");
			int isbn=sc.nextInt();
			 for(Book l1:b)
			 {
				 if (l1.getIsbn()==isbn)
				 {
			        throw new ISBNAlreadyExistsException("ISBN Already Existed");
				 }
			 }		  
			 System.out.println("Enter book title,author, totalpages");
		     String title=sc.next();
		     String  author =sc.next();
		     int totalpages=sc.nextInt();  
		     b.add(new Book(title,author,totalpages,isbn));         
		}		
	}
	public static void issueBooks(List<Book> b,List<BookIssue> bi) throws Exception
	{ 
		Scanner sc=new Scanner(System.in);
	    int isbn,k = 0 ;		
		System.out.println("Enter ISBN of book to be issued");
		isbn=sc.nextInt();		 
		 for(Book p:b)
		 {
			 if (p.getIsbn()==isbn)
			 {   k=1;
				 b.remove(p);
				  bi.add(new BookIssue(p.getTitle(),p.getAuthor(),p.getTotalpages(),p.getIsbn()));
				  System.out.println(bi);
				 break;
			 }
		 }		 
		 if(k==0)
		 {
			 throw new ISBNDoesNotExistsException("ISBN Does NOT Exists");
		 }}
	public static void checkIssued(List<BookIssue> bi) throws BookAlreadyIssuedException {
		 int isbn,i=0;
		 System.out.println("enter isbn");
		 Scanner sc=new Scanner(System.in);
		 isbn=sc.nextInt();
		 for(BookIssue q:bi)
		 {
			 if (q.getIsbn()==isbn)
			 {  
				 throw new BookAlreadyIssuedException("Book already issued");
			 }
		 }	 
	 }
		 public static void remainingBooks(List<Book> b) {
			 for(Book r:b)
			 {	 
					// System.out.println(r.getTitle()+ " "+r.getAuthor()+ "" +r.getTotalpages() + "" +r.getIsbn());
				 System.out.println(r);
			 }
		 }
		
		 
}
