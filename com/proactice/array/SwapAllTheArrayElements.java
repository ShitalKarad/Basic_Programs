package com.proactice.array;

import java.util.Arrays;

public class SwapAllTheArrayElements {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length;i++) {
			if(i%2 == 0) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}  
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
