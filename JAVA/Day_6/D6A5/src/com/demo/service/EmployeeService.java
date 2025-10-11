package com.demo.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		emparr[0] = new SalariedEmp("s","Radha", new Date("03/11/2003"),"SDE","Developer",50000);
		emparr[1] = new SalariedEmp("s","Rajan",new Date(2000,04,23),"HR","Designer",40000);
		emparr[2] = new ContractEmp("c","Ram", new Date("16/01/2002"),"SDE","testing",14.5f,4000.0);
		emparr[3] = new ContractEmp("c","Pranav", new Date("17/01/2002"),"SDE","Developer",20.5f,4000.0);
		count=4;
	}
	
	public static boolean addEmp()
	{
		if(count<emparr.length)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter employee id type (s/c)");
			String id =sc.next();
			
			System.out.println("Enter employee name");
			String name =sc.next();
			
			System.out.println("Enter employee Date");
			String date =sc.next();
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dt=null;
			try {
				dt = sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			System.out.println("Enter employee deparatment");
			String dept =sc.next();
			
			System.out.println("Enter employee Designation");
			String desg =sc.next();
			
			System.out.println("do you want to add Salaried employee or Contract Employee \nChoice: ");
			String choice="s";
			choice = sc.next();
			
			if(choice.equals("s"))
			{
				System.out.println("Enter Salaried employee Salary :");
				double sal =sc.nextDouble();
				
				emparr[count]= new SalariedEmp(id,name,dt,dept,desg,sal);
			}
			else if(choice.equals("c"))
			{
				System.out.println("Enter Contract employee Hours and charges :");
				float hrs =sc.nextFloat();
				double charges = sc.nextDouble();
				
				emparr[count]= new ContractEmp(id,name,dt,dept,desg,hrs,charges);
			}
			else
			{
				System.out.println("Enter Valid response");
			}
			return true;
		}
		return false;
		
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

	public static Employee searchById()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id ");
		String id =sc.next();
		
		for(Employee e:emparr)
		{
			if(e!=null)
			{
				if(e.getId().equals(id))
				{
					return e;
				}
			}
		}
		return null;
	}

	public static boolean modifyById()
	{
		Scanner sc = new Scanner(System.in);
		Employee e = searchById();
		System.out.println("Enter Contract employee Salary or charges :");
		double charges = sc.nextDouble();
		if(e!=null)
		{
			if( e instanceof SalariedEmp)
			{
				((SalariedEmp)e).setSal(charges);
			}
			else
			{
				((ContractEmp)e).setCharges(charges);
			}
			return true;
		}
		return false;
	}

	public static void displaySalariedEmp()
	{
		for(Employee e:emparr)
		{
			if(e instanceof SalariedEmp && e!=null)
			{
				System.out.println(e);
			}
		}
	}

	public static void displayContractEmp()
	{
		for(Employee e:emparr)
		{
			if(e instanceof ContractEmp && e!=null)
			{
				System.out.println(e);
			}
		}
	}

	public static Employee searchByName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		String name =sc.next();
		
		for(Employee e:emparr)
		{
			if(e.getName().equals(name))
			{
				return e;
			}
		}
		return null;
	}

	public static void CalNetSalary()
	{
		for(Employee e:emparr)
		{
			if(e instanceof SalariedEmp)
			{
				double sal = ((SalariedEmp) e).getSal();
				System.out.println("Net Salary of " + e.getName() + " is " + (sal - 0.10*sal));
			}
		}
	}
}
