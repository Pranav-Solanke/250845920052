package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;

public class TestEmployeeMgntSystem {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new Employee\n2. Display all");
		System.out.println("3. Display by id\n4. change sal or charges");
		System.out.println("5. Display Salaried Employee\n6. Display Contract Employee");
		System.out.println("7. Search By Name\n8. calculate net salary\n9. exit\n Choice :");
		
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			EmployeeService.addEmp();
			break;
			
		case 2:
			EmployeeService.displayAll();
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		case 7:
			break;
			
		case 8:
			break;
			
		case 9:
			System.out.println("thank you");
			break;
			
			default:
				
		}
		}while(choice!=9);
	}

}
