package com.proactice.array;

import java.util.Arrays;

public class SwapArrayElement {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 9, 0 };
		System.out.println("My original array "+ Arrays.toString(arr));
		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;

		System.out.println("Array after swaping " + Arrays.toString(arr));

	}

	public static int swapArrayElement(int arr[]) {

		return 0;

	}

}
