package com.proactice.array;

import java.util.Arrays;

public class ShiftAllNegativeElementToLeft {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { -12, 3, -19, 29, 5, -61, 44, 7, -9 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (0 > arr[i]) {
			for (int j = i; j < arr.length-1; j++) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
			}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
