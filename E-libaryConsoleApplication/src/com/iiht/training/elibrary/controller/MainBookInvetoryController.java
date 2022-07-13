package com.iiht.training.elibrary.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iiht.training.elibrary.exception.BookAlreadyIssuedException;
import com.iiht.training.elibrary.exception.ISBNAlreadyExistsException;
import com.iiht.training.elibrary.exception.ISBNDoesNotExistsException;
import com.iiht.training.elibrary.inventory.BookInvetory;
import com.iiht.training.elibrary.model.Book;
import com.iiht.training.elibrary.model.BookIssue;

public class MainBookInvetoryController {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of books");
		int n=sc.nextInt();
		List<Book> b=new ArrayList<>();
		List<BookIssue> bi=new ArrayList<>();
		Boolean ch=true;
		while(ch)
		{
			System.out.println("\t 1.Add isbn to books"+" \t 2.Issuebooks"+" \t 3.CheckIssuebooks"+"\t 4.Books reamining after issusing"+"\t 5.Exit");
			int a=sc.nextInt();
		switch(a)
			{
			case 1:
			{
				try
				{
					BookInvetory.addISBN(b, n);
				}
				catch(ISBNAlreadyExistsException e)
				{
					System.out.println(e);
				}
			}
			break;
			case 2:
			{
				try
				{
					BookInvetory.issueBooks(b, bi);
				}
				catch(ISBNDoesNotExistsException e)
				{
					System.out.println(e);
				}
			}
			break;
			case 3:
			{
				try
				{
					BookInvetory.checkIssued(bi);
				}
				catch(BookAlreadyIssuedException e)
				{
					System.out.println(e);
				}
			}
			break;
			case 4:
			{
				
				BookInvetory.remainingBooks(b);
			}
			break;
			case 5:
			{
				
				ch=false;
			}
			break;
			}}
	}

}
