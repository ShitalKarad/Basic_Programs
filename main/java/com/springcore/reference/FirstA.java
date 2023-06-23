package com.springcore.reference;

public class FirstA {
	private int num;
	private SecondB obj ;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public SecondB getObj() {
		return obj;
	}
	public void setObj(SecondB obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "FirstA [num=" + num + ", obj=" + obj + "]";
	}
	public FirstA(int num, SecondB obj) {
		super();
		this.num = num;
		this.obj = obj;
	}
	public FirstA() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
