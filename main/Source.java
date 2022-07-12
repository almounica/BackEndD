package com.main;

public class Source {
public String handleException(Activity a) throws TestException
{
	if(a.string1==""||a.string2=="") {
	throw  new  TestException("null value found");}
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
	      default:throw new  OperatorException("not valid operator");
       }
	
	return s3;}
	

}

