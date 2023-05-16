package com.practice.string;

import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
		int arr[] = {10,2,14,100,74,99};
		 int count = 0;
		System.out.println(Arrays.toString(arr));
		int temp [] = arr.clone();
		for (int i = temp.length-1; i>=0 ;i--) {
			arr[count++] = temp[i];
			
		}
		System.out.println("reverse array is " + Arrays.toString(arr));
	}

}
