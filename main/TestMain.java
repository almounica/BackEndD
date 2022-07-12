package com.main;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1="";
		String string2="hello";
		System.out.println("enter operator");
		String operator=sc.next();
		@SuppressWarnings("unused")
		Activity a = new Activity(string1,string2,operator);
		Source s=new Source();		
	    try {
	    	System.out.println(s.handleException(a));
	    }catch(TestException e){
	    	System.out.println(e.getMessage());
	    }
           try {
         System.out.println(s.doOperation(a));
	    }catch(OperatorException e2)
	    {
	    	System.out.println(e2.getMessage());
	    }
	    
	    }
	 
	}


