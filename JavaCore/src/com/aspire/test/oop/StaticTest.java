package com.aspire.test.oop;

public class StaticTest {
	

	public static void main(String[] args) {
		Employee e=new Employee("harry",5000);
		System.out.println(e.getName()+" "+e.getSalary());
		

	}

}
class Employee{
	public Employee(String n,double s){
		name=n;
		salary=s;
		id=0;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getId(){
		return id;
	}
	public void setId(){
		id=nextId;
		nextId++;
	}
	public static int getNextId(){
		
		return nextId;
	}
	private int id;
	private String name;
	private double salary;
	private static int nextId=1;
	
}
