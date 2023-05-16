package com.proactice.array;

import java.util.Objects;

public class Employee {
	
	int id ;
	String name ;
	int salary ;
	Date date;
	
	
	public Employee(int id, String name, int salary ,Date date) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
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



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Employee() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return  id+" " +name+" " +salary+" " +date;
	}



	@Override
	public int hashCode() {
		return Objects.hash(date, id, name, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(date, other.date) && id == other.id && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	
}
