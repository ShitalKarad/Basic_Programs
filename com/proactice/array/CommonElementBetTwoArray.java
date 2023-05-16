package com.proactice.array;

public class CommonElementBetTwoArray {

	public static String findCommonElement(int[] arr, int[] brr) {
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < brr.length; j++) {
				if (arr[i] == brr[j]) {
					count++;
				}
			}
			if (count == 1) {
				temp = temp + Integer.toString(arr[i]) + ",";
			}
		}
		return temp;
	}
 
	public static void main(String[] args) {
		int arrayA[] = { 12, 23, 34, 67, 78, 91, 56 };
		int arrayB[] = { 39, 25, 15, 23, 55, 91, 66, 22 };
		String comonNumber = findCommonElement(arrayA, arrayB);
		System.out.println("common number between two array is " + comonNumber);
	}

}
