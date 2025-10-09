package com.demo.beans;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person
{
	private int id;
	private String name;
	private Date bdate;
	
	static int count;
	static
	{
		count = 1;
	}
	
	public Person() {
		super();
		this.id=count++;
		this.name=null;
		this.bdate=null;
	}

	public Person(String name, Date bdate) {
		super();
		this.id = count++;
		this.name = name;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(bdate);
		
		return "Person [id=" + id + ", name=" + name + ", bdate=" + str + "]";
	}
	
}
