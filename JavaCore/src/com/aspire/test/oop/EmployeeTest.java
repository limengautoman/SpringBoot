package com.aspire.test.oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
	private static int nextId=0;

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		EmployeeTest.nextId = nextId;
	}

	public static void main(String[] args) {
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("jack",75000,1987,12,12);
		staff[1]=new Employee("lucy",78780,1989,11,11);
		staff[2]=new Employee("lili",23232,1987,10,01);
		for(Employee e:staff){
			e.raiseSalary(5);
			
			
		}
		for(Employee e:staff){
			System.out.println(e.getName()+""+e.getSalary()+""+e.getHireDay());
		}
		

	}

}
//class Employee{
	private String name;
	private double salary;
	private Date hireDay;
	private static int nextId=1;
	public Employee() {
		super();
		System.out.println("parent constructor");
		
	}
	public Employee(String n,double s,int year,int month,int day){
		name=n;
		salary=s;
		GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		hireDay=calendar.getTime();
		System.out.println("override constructor");
		
	}
	/*public String getName(){
		return name;
	}
	public double getSalary(){ 
		return salary;
	}
	public Date getHireDay(){
		return hireDay;
	}*/
	
	public void raiseSalary(double byPercent){
		double raise=salary*byPercent/100;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	
	
	
	
	
}
