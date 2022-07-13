package com.iiht.training.elibrary.exception;

@SuppressWarnings("serial")
public class BookAlreadyIssuedException extends Exception{
	public BookAlreadyIssuedException(String s)
	{
		super(s);
	}
}
