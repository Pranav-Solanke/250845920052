package com.demo.beans;

import java.util.Date;

public class SalariedEmp extends Employee
{
	private double sal;
	private double bonus;
	public SalariedEmp()
	{
		super();
		sal=0;
		bonus=0;
	}
	public SalariedEmp(String name, Date bdate, String dept, String desg)
	{
		super(name, bdate, dept, desg);
		this.sal=sal;
		this.bonus=sal*0.10;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
}
