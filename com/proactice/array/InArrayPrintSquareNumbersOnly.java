package com.proactice.array;

public class InArrayPrintSquareNumbersOnly {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 5, 3, 2, 6, 7, 3, };
		
		for (int i = 0; i < arr.length; i++) {
		
			int count = 0;
			
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			
			if (count == 1) {
				System.out.println(arr[i] + " count is " +count);
			}
		}
	}

}
