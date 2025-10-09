//code for Date
//issue with date in this code
package com.demo.test;
import java.util.Date;

import com.demo.beans.Person;

public class TestPerson {

	public static void main(String[] args)
	{
		Person p1 = new Person(1,"Pranav",new Date(2000,04,23));
		System.out.println(p1);
	}
}
