package com.iiht.training.elibrary.exception;

@SuppressWarnings("serial")
public class ISBNDoesNotExistsException extends Exception {
	public ISBNDoesNotExistsException(String s)
	{
		super(s);
	}
}
