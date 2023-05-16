package com.proactice.array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapirstToLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array"); 
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elemnet of array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		 int temp = 0;
		 int b = arr[arr.length-1];
		 temp = arr[0];
		 
		 arr[0] = b;
		 arr[arr.length-1] = temp;
		 System.out.println("array after swapping" +Arrays.toString(arr));

	}
	
	
}
