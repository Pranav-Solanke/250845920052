package com.demo.beans;

import java.util.Date;

public class Employee extends Person
{
	private String dept;
	private String desg;
	
	public Employee()
	{
		super();
		this.dept=dept;
		this.desg=desg;
	}
	
	public Employee(String name, Date bdate,String dept,String desg)
	{
		super(name, bdate);
		this.dept=dept;
		this.desg=desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override //super.toString()
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]"; //imp
	}
}
