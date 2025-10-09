//
//issue with date in this code
//super.toString()
package com.demo.test;
import java.util.Date;
import com.demo.beans.Employee;
import com.demo.beans.Person;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p1 = new Person("Pranav",new Date("13/12/2003"));
		System.out.println(p1);
		
		Employee e1 = new Employee("Krishna",new Date("01/11/2002"),"HR","Designer");
		System.out.println(e1);
	}
}
