package com.mypackage.service;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMangementServiceImpl implements  EmployeeManagementService {
	
	public void deleteEmp(ArrayList<Employee> e) throws MyException {
		Scanner sc = new Scanner(System.in);
        System.out.println("\t Delete"+"\t 1.By id"+"\t 2.By name"+"\t 3.By salary"+"\t 4. By designation");        
        System.out.println("Enter choice ");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("enter the id:");
               int id = sc.nextInt();
                int a = 0;
                for (Employee k : e) {
                    if (id == k.getId()) {
                    	e.remove(k);
                        
                        a++;
                    }
                }
                if (a == 0) {
                    throw new MyException("Employee Details are not available, Please enter a valid ID!!");
                }
                break;

            case 2:
                System.out.println("enter the name:");
               String name = sc.next();
                int b = 0;
                for (Employee k : e) {
                    if (name.equals(k.getName())) {
                    	e.remove(k);
                        b++;
                    }
                }
                if (b == 0) {
                    throw new MyException("Employee Details are not available, Please enter a valid Name!!");
                }
                break;
            case 3:
            	System.out.println("enter the salary");
            	Long salary=sc.nextLong();
            	int c = 0;
                for (Employee k : e) {
                    if (salary==k.getSalary()) {
                        e.remove(k);
                        c++;
                    }
                }
                if (c == 0) {
                    throw new MyException("No such salary");
                }
                break;
            case 4:
            	System.out.println("enter the designation");
            	String designation =sc.next();
            	int d = 0;
                for (Employee k : e) {
                    if (designation.equals(k.getDesignation())) {
                        e.remove(k);
                        d++;
                    }
                }
                if (d == 0) {
                    throw new MyException("No such designation ");
                }
                break;
        }
		
	}

	
	public void updateEmp(ArrayList<Employee> e) throws MyException {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("\nEnter the Employee ID to EDIT the details");
	       int  id = sc.nextInt();
	        int j=0;
	        for(Employee k: e)
	        {
	            if(id == k.getId())
	            {
	                j++;
	                    System.out.println("\t Update"+"\t 1.id"+"\t 2.name"+"\t 3.salaray"+"\t 4.Designation");            
	                    System.out.println("Enter your choice : ");
	                    int cho = sc.nextInt();
	                    switch(cho)
	                    {
	                        case 1: throw new MyException("We cannot update Employee Id ");
	                        case 2: System.out.println("Enter new Employee Name:");
	                             String name = sc.next();
	                             k.setName(name);
	                             System.out.println(e+"\n");
	                            break;

	                        case 3: System.out.println("Enter new Employee Salary:");
	                            Long sal = sc.nextLong();
	                            k.setSalary(sal);
	                            System.out.println(e+"\n");
	                            break;

	                        case 4: System.out.println("Enter new Employee Designation :");
	                        String des = sc.next();
	                            k.setDesignation(des);
	                            System.out.println(e+"\n");
	                            break;

	                    }          
	            }
	        }
	        if(j == 0)
	        {
	          throw new MyException(" enter a valid ID");
	        }
	}
	

	public void addEmp(ArrayList<Employee> e) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
         int  id = sc.nextInt();
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Salary :");
        Long salary = sc.nextLong();
        System.out.println("Enter Designation :");
        String designation = sc.next();
        e.add(new Employee(id, name, salary, designation));
		
	}

	public void searchEmp(ArrayList<Employee> e) throws MyException {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("\t Search"+"\t 1.By id"+"\t 2.By name"+"\t 3.By salary"+"\t 4. By designation");        
	        System.out.println("Enter choice ");
	        int ch = sc.nextInt();
	        switch (ch)
	        {
	            case 1:
	                System.out.println("enter the id:");
	               int id = sc.nextInt();
	                int a = 0;
	                for (Employee k : e) {
	                    if (id == k.getId()) {
	                        System.out.println(e + "\n");
	                        a++;
	                    }
	                }
	                if (a == 0) {
	                    throw new MyException("Enter valid id");
	                }
	                break;

	            case 2:
	                System.out.println("enter the name:");
	               String name = sc.next();
	                int b = 0;
	                for (Employee k : e) {
	                    if (name.equals(k.getName())) {
	                        System.out.println(e + "\n");
	                        b++;
	                    }
	                }
	                if (b == 0) {
	                    throw new MyException("Enter valid name");
	                }
	                break;
	            case 3:
	            	System.out.println("enter the salary");
	            	Long salary=sc.nextLong();
	            	int c = 0;
	                for (Employee k : e) {
	                    if (designation.equals(k.getDesignation())) {
	                        System.out.println(e + "\n");
	                        c++;
	                    }
	                }
	                if (c == 0) {
	                    throw new MyException("No such salary");
	                }
	                break;
	            case 4:
	            	System.out.println("enter the designation");
	            	String designation =sc.next();
	            	int d = 0;
	                for (Employee k : e) {
	                    if (designation==k.getDesignation()) {
	                        System.out.println(e + "\n");
	                        d++;
	                    }
	                }
	                if (d == 0) {
	                    throw new MyException("No such designation ");
	                }
	                break;
	        }
		
	}


	
	public void displayEmp(ArrayList<Employee> e) {
		for(Employee k:e)
		{
			System.out.println(k.getId()+ " "+k.getName()+ " "+k.getSalary()+" "+k.getDesignation());
		}
		
	}

	





	

}
