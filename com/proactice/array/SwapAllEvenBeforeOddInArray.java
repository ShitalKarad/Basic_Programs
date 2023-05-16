package com.proactice.array;

import java.util.Arrays;

public class SwapAllEvenBeforeOddInArray {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8};
		int temp = 0;
		
		for(int i = 0; i<array.length-1;i++) {
			
			if(array[i] % 2 != 0) {
				
				for(int j = i;j<array.length-1;j++) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
