package com.proactice.array;

import java.util.Arrays;

public class Square {
	public static void main(String[] args) {
		int arr[] = {5,2,3,4,5,6,4};
		System.out.println("My original array is "+Arrays.toString(arr));
		int temp[] = arr.clone();
		
		for (int i = 0; i < temp.length-1; i++) {
		arr[i] =  temp[i]*temp[i];	
		}
		
		System.out.println("Array after square "+Arrays.toString(arr));

	}
}
