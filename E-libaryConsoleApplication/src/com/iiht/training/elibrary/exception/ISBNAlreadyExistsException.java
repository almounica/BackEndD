package com.iiht.training.elibrary.exception;

@SuppressWarnings("serial")
public class ISBNAlreadyExistsException extends Exception  {
	public ISBNAlreadyExistsException(String s)
	{
		super(s);
	}
}
