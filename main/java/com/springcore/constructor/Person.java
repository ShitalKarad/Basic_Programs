package com.springcore.constructor;

public class Person {

	private String personName;
	private int personId;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String personName, int personId) {
		super();
		this.personName = personName;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return this.personName + " : " +  this.personId ;
	}
	
	
}
