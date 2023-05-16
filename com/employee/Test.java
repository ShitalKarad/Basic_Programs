package com.employee;

public class Test {

	Test t;
	Test Test(){
		if(t==null) {
			t = new Test();
		}
		return t;
	}
	public void m1() {
		System.out.println("my name is shital karad");
	}
	
}
