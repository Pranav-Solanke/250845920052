//generate id
//issue with date in this code

//removed id parameter in constructor
//removed setid
//
package com.demo.test;
import java.util.Date;

import com.demo.beans.Person;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p1 = new Person("Pranav",new Date("13/12/2003"));
		Person p2 = new Person("Pranav",new Date("13/12/2003"));
		Person p3 = new Person("Pranav",new Date("13/12/2003"));
		Person p4 = new Person("Pranav",new Date("13/12/2003"));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
