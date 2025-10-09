package com.demo.beans;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person
{
	private int id;
	private String name;
	private Date bdate;
	
	public Person() {
		super();
		this.id=0;
		this.name=null;
		this.bdate=null;
	}

	public Person(int id, String name, Date bdate) {
		super();
		this.id = id;
		this.name = name;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM");
		String str = sdf.format(bdate);
		
		return "Person [id=" + id + ", name=" + name + ", bdate=" + str + "]";
	}
//	Date dt = null;
//	try {
//		dt = sdf.parse(bdate);
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
}
