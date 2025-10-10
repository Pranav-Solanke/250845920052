package com.demo.service;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.*;
public class EmployeeService
{
	static Employee[] emparr;
	static private int count;
	static
	{
		emparr = new Employee[10];
		emparr[0] = new Employee("i","Krishna",new Date("01/11/2002"),"HR","Designer");
		emparr[1] = new Employee("i","Rajan",new Date(2000,04,23),"HR","Designer");
		emparr[2] = new Employee("i","Arti",new Date(2000,04,23),"UX","Designer");
		count=3;
	}
	
	public static void addEmp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee type (s/c)");
		String id =sc.next();
		
		System.out.println("Enter employee name");
		String name =sc.next();
		
		System.out.println("Enter employee Date");
		String date =sc.next();
		
		System.out.println("Enter employee deparatment");
		String dept =sc.next();
		
		System.out.println("Enter employee Designation");
		String desg =sc.next();
	}
	
	public static void displayAll()
	{
		for(Employee e:emparr)
		{
			if(e!=null)
			{
				System.out.println(e);
			}
		}
	}
}
