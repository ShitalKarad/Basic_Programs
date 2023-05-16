package com.proactice.array;

public class PrintArrayReverseOrder {

	public static void main(String[] args) {
		int array[] = {3, 90, 45, 29, 37, 78};
		
		System.out.println("my reverse array is");

		for(int i= array.length-1; i>=0;i--) {
			System.out.print(array[i] + " ");
		}
	}
}
