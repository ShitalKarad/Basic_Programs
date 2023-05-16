package com.proactice.array;

import java.util.Arrays;
import java.util.Iterator;

public class SortArray {
	public static void main(String[] args) {
		int array[] = {10,2,5,7,20,13};
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
 					
				}
			}
			
		}
		//System.out.println(Arrays.toString(array));
		System.out.println("sorted array is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}

}
