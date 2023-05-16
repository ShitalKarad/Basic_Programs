package com.proactice.array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element of array");
		for (int i = 0; i <arr.length; i++) {
		arr[i] = sc.nextInt();
	}
		System.out.println(Arrays.toString(arr));
		
		int a = arr[0];
		System.out.println("a=> "+a);
		int b = arr[(arr.length/2)];
		System.out.println("b => "+b);
		int c = arr[arr.length-1];
		System.out.println("c => " +c);
		
		int addition = addition(a, b, c);
		System.out.println(addition);
		
	}


	public static int addition(int a , int b ,int c) {
		int add = a + b + c;
		
		return add;
		
	}
}
