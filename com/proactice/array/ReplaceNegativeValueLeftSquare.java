package com.proactice.array;

import java.util.Arrays;

public class ReplaceNegativeValueLeftSquare {

	public static void main(String[] args) {
		
		int array[] = {4,- 12, 3, -19, 29, 5, -61, 44, 7, -9};
		System.out.println(" original array  " +Arrays.toString(array));
	
		for(int i = 0; i<array.length-1;i++) {
			if (array[i+1] < 0) {
				 array[i] = array[i] * array[i];
				
			}
		}
		
				System.out.println("array square of before negative element " +Arrays.toString(array));
	}
}
