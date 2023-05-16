package com.proactice.array;

import java.util.Iterator;

public class FindMaxAndMinNu {


public static int maxNumber(int[]arr) {
	
	int max = arr[0];
	
	for(int i = 0;i<arr.length;i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
		
	}
	
 return max; 
}
public static int minNumber(int[] array) {
	
	int min = array[0];
	
	for(int i = 0;i<array.length;i++) {
		
		if(array[i] < min) {
			min = array[i];
			
		}
		
	}
	
	return min;
	
	
}

public static void main(String[] args) {
	int array[] = {10,2,5,7,20,13};
	
	int output =maxNumber(array);
	System.out.println("my max number is " +output);
	int myMinNumber = minNumber(array);
	System.out.println("My Min number is "+ myMinNumber );
	
}

}