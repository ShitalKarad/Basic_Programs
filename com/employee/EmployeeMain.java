package com.employee;

import com.proactice.array.Date;
import com.proactice.array.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeP aray[] = new EmployeeP[3];
		aray[0] = new EmployeeP(1, "shital", 400, new Date(10, 02, 1994));
		aray[1] = new EmployeeP(2, "vishal", 500, new Date(11, 05, 2003));
		aray[2] = new EmployeeP(3, "karad", 1000, new Date(11, 05, 2003));

		for (int i = 0; i < aray.length; i++) {
			int count = 0;
			for (int j = 0; j < aray.length; j++) {
				if (aray[i].getDate().equals(aray[j].getDate())) {
					count++;
					if (count > 1) {
						System.out.println(aray[i]);
					}
				}
			}
		}
	}

}
