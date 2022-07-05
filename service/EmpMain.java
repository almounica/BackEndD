package com.mypackage.service;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		System.out.println("Welcome to employee management System");
		EmployeeManagementService emp = new EmployeeMangementServiceImpl();
        ArrayList<Employee> e = new ArrayList<Employee>();
        e.add(new Employee(1,"mouni", 60000L,"SoftwareEngineer"));
		Boolean ch=true;
		Scanner sc = new Scanner(System.in);
		while(ch)
		{
			System.out.println("\t 1.Show all employee"+" \t 2.Search employee"+"\t 3.Delete Employee"+"\t 4.Add employee"+"\t 5.Update Employee"+"\t 6.Exit");
			int n=sc.nextInt();
		switch(n)
			{
			case 1:
			{
				emp.displayEmp(e);
			}
			break;
			case 2:
			{
				try
				{
					emp.searchEmp(e);
				}catch(MyException e1)
				{
					System.out.println(e1.getMessage());
				}
			}
			break;
			case 3:
			{
				try
				{
					emp.deleteEmp(e);
				}catch(MyException e1)
				{
					System.out.println(e1.getMessage());
				}
			}
			break;
			case 4:
			{
				emp.addEmp(e);
			}
			break;
			case 5:
			{
				try
				{
					emp.updateEmp(e);
				}catch(MyException e1)
				{
					System.out.println(e1.getMessage());
				}
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
