package com.proactice.array;

public class DuplicateNumbers {

	public static String findDubplicateNumbers(int[] arr) {
		String temp = "";
		for(int i = 0; i<arr.length;i++) {
			int count = 0;
			for(int j = i+1; j < arr.length;j++) {
				if (arr[i] ==arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				temp = temp + Integer.toString(arr[i])+",";			
				
			}
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		int array[] = {3, 10, 90, 1,78, 56, 10, 78, 34, 61 ,1};
		String output = findDubplicateNumbers(array);
		System.out.println("duplicat numbers in an array is "+ output);
	}
}
