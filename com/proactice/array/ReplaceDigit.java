package com.proactice.array;

import java.util.Arrays;

public class ReplaceDigit {

	public static void main(String[] args) {
		
		int array[] = {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		System.out.println("my original array is " + Arrays.toString(array));
		
		for(int i = 0; i<array.length;i++) {
			if (array[i] == 0){
				array[i] = 1;
			}
		}
		System.out.println(" array after replacing 1 is " + Arrays.toString(array));
	}
	
}
