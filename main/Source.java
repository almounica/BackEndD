package com.main;

public class Source {
public String handleException(Activity a) throws TestException, OperatorException
{
	if(a.string1==""||a.string2=="") {
	throw  new  TestException("null value found");}
	if(!(( a.operator == "+") || (a.operator == "-"))){
		  throw new  OperatorException("not valid operator");
	  }
	return "";
}
public String doOperation(Activity a)  {
	String s3="";
	switch(a.operator)
		{
		case "+":
		{
			s3=a.string1+a.string2;
		}
		break;
		case "-":
		{
			s3=a.string1.replace(a.string2,"");
		}
		break;
       }
	
	return s3;}
	

}

