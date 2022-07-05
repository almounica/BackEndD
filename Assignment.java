package Mounica;

import java.util.Scanner;
@SuppressWarnings("serial")
class MyException extends RuntimeException
{
	MyException(String s){
		super(s);
	}
}
class Organisation{
	String Oname;
	String location;
}
class Emp extends Organisation
{
	int empid;
	String name;
	String dept;
	int salary;
	public Emp(int id,String n,String dpt,int s,String on,String l)
	{
		this.empid=id;
		this.name=n;
		this.dept=dpt;
		this.salary=s;
		this.Oname=on;
		this.location=l;
	}
	void DisplayEmp(Emp e[],int size)
	{
		for(int i=0;i<=size;i++)
		{
			System.out.println(e[i].empid+" "+e[i].name+" "+e[i].dept+" "+e[i].salary+" "+e[i].Oname+" "+e[i].location);
		}
	}
	void DeleteEmp(Emp e[],int Id) 
	{
		try{for(int i=0;i<e.length;i++)
		{
			if(e[i].empid==Id)
			{
				for(int j=i;j<e.length-1;j++)
				{
					e[j]=e[j+1];
				}
			}
	
		}if(Id>=e.length)
		{
			throw new MyException("Record not found");
		}}catch(MyException e2)
	    {
			System.out.println(e2.getMessage());
	    }
		
	}
	void UpdateEmp(Emp e[],int Id,String newname) 
	{
		try{for(int i=0;i<e.length;i++)
		{
			if(e[i].empid==Id)
			{
				e[i].name=newname;
			}
			if(i>=e.length)
			{
				throw new MyException("Record not found");
			}
		}}catch(MyException e1)
		{
		System.out.println(e1.getMessage());
		}
	}
}

public class Assignment {

	public static void main(String[] args) {
		Boolean ch=true;
		int size=3;
		Emp e[]=new Emp[5];
		Scanner sc = new Scanner(System.in);
		while(ch)
		{
			
		System.out.println("select choice"+"\t1. initalize employee"+"\t2.display employee"+"\t3.update Employee"+"\t"
				+"\t 4.Delete employee"+"\t 5.Addemplyee"+" \t 6.Exit");
		
		 int n=sc.nextInt();
		switch(n)
		{	
		case 1:
		{
			
		Emp e1= new Emp(1,"mouni","EEE",66000,"FTD","kkd");
		Emp e2= new Emp(2,"gana","EEE",50000,"LNT","kkd");
		Emp e3= new Emp(3,"lalli","CSE",66000,"FTD","Hyd");
		Emp e4= new Emp(4,"Vandy","IT",66000,"FTD","Vizag");
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=e4;
		
		}
		break;
		case 2:
		{
			e[1].DisplayEmp(e,size);
		
		}
		break;
		case 3:
		{
			System.out.println("Enter ID and new name of the employee to be updated");
			int id=sc.nextInt();
			String newname=sc.nextLine();
			e[1].UpdateEmp(e,id,newname);
		
		}
		break;
		case 4:
		{   
			System.out.println("Enter the employee id to be deleted");
			int eid=sc.nextInt();
			e[1].DeleteEmp(e,eid);
		}
		break;
		case 5:
		{   
		     System.out.println("enter eid");
		     int empid=sc.nextInt();
		    System.out.println("enter name");
		     String name=sc.next();  
		     System.out.println("enter dept");
		     String dept=sc.next();
		    System.out.println("enter salary");
		     int salary=sc.nextInt();
		     System.out.println("enter organisation name");
		     String Oname=sc.next();
		    System.out.println("enter location");
		     String location=sc.next();
		    size++;
			e[size]=new Emp(empid,name,dept,salary,Oname, location);
		}
		break;
		case 6:
		{
			
			ch=false;
		}
		break;
		default: System.out.println("invalid");
		}
		}
	}
}







