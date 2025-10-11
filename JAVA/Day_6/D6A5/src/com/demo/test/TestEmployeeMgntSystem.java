package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
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
			boolean status =EmployeeService.addEmp();
			
			if(status)
			{
				System.out.println("Employee added successfully");
			}
			else
			{
				System.out.println("Employee not added");
			}
			break;
			
		case 2:
			EmployeeService.displayAll();
			break;
			
		case 3:
			Employee e =EmployeeService.searchById();
			if(e!=null)
			{
				System.out.println(e);
			}
			else
			{
				System.out.println("Employee does not exists");
			}
			break;
			
		case 4:
			status = EmployeeService.modifyById();
			if(status) {
				System.out.println("Updated successfully");
			}else {
				System.out.println("not found");
			}
			break;
			
		case 5:
			EmployeeService.displaySalariedEmp();
			break;
			
		case 6:
			EmployeeService.displayContractEmp();
			break;
			
		case 7:
			Employee emp =EmployeeService.searchByName();
			
			if(emp!=null)
			{
				System.out.println(emp);
			}
			else
			{
				System.out.println("not found");
			}
			break;
			
		case 8:
			EmployeeService.CalNetSalary();
			
			break;
			
		case 9:
			System.out.println("thank you");
			break;
			
			default:
				
		}
		}while(choice!=9);
	}

}
