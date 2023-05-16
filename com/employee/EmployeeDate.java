package com.employee;

import java.util.Objects;

public class EmployeeDate {

	
	int day ;
	int month;
	int year;
	
	public EmployeeDate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day +"/"+month+"/"+year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDate other = (EmployeeDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	
	
}
