package com.proactice.array;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
		int count = 0;
		int[] arr = { 1, 2, 3, 4, 6 };
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (count != arr[i]) {
				System.out.println(" missing number in array is " + count);
			}
		}
	}
}
