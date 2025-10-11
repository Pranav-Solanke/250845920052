package com.demo.beans;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person
{
	private String id;
	private String name;
	private Date bdate;
	
	static int count;
	static
	{
		count = 1;
	}
	
	public Person() {
		super();
		this.id= "i"+count++;
		this.name=null;
		this.bdate=null;
	}

	public Person(String id ,String name, Date bdate) {
		super();
		this.id = id+count++;
		this.name = name;
		this.bdate = bdate;
	}

	public String getId() {
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
		
		return "[id=" + id + ", name=" + name + ", bdate=" + str + "]";
	}
	
}
