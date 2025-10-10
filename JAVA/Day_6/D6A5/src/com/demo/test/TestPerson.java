
//issue with date in this code
//
package com.demo.test;
import java.util.Date;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p1 = new Person("i","Pranav",new Date("13/12/2003"));
		System.out.println(p1);
		
		Employee e1 = new Employee("i","Krishna",new Date("01/11/2002"),"HR","Designer");
		System.out.println(e1);
		
		SalariedEmp s1 = new SalariedEmp("s","Radha", new Date("03/11/2003"),"SDE","Developer",50000);
		System.out.println(s1);
		
		ContractEmp c1 = new ContractEmp("c","Ram", new Date("16/01/2002"),"SDE","Developer",14.5f,4000.0);
		System.out.println(c1);
	}
}

