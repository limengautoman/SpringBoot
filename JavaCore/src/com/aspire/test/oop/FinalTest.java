package com.aspire.test.oop;

public class FinalTest {
	private  final String a="hello";
	private static int nextId=1;
	private int id;
	private String name;

	public static void main(String[] args) {
		FinalTest test=new FinalTest();
	    test.setId();
	    FinalTest test1=new FinalTest();
	    test1.setId();
	    System.out.println(test1.getId());
	    FinalTest.getNextId();
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		FinalTest.nextId = nextId;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = nextId;
		nextId++;
	}

	public String getA() {
		return a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
     
}
