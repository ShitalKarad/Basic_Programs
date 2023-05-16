package com.proactice.array;

public class MaxCharInArray {

	public static void main(String[] args) {
		Employee array[] = new Employee[3];
		array[0] = new Employee(1, "shital", 400, new Date(10, 02, 1994));
		array[1] = new Employee(2, "vishal", 500, new Date(11, 05, 2003));
		array[2] = new Employee(3, "karad", 1000, new Date(11, 05, 2003));

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i].getDate().equals(array[j].getDate())) {
					count++;
					if (count > 1) {
						System.out.println(array[i]);
					}
				}
			}
		}

	}

}
