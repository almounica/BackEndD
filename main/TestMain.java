package com.main;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws TestException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string 1");
		String string1=sc.next();
		System.out.println("enter string 2");
		String string2=sc.next();
		System.out.println("enter operator");
		String operator=sc.next();
		@SuppressWarnings("unused")
		Activity a = new Activity(string1,string2,operator);
		Source s=new Source();		
	    try {
	    	System.out.println(s.handleException(a));
	    }catch(TestException e){
	    	System.out.println(e.getMessage());
	    }catch(OperatorException e2)
	    {
	    	System.out.println(e2.getMessage());
	    }
         System.out.println(s.doOperation(a));
	    
	    }
	 
	}


