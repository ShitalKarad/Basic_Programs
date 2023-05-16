 package com.proactice.array;

import java.util.Iterator;

public class FindSecondMaxNum {
	public static void main(String[] args) {
		
		int array[] = {-20, 0, -25, 15, 19, 37, 23} ;
		FindSecondMaxNum obj = new FindSecondMaxNum();
		 int myVal = obj.findScondMax(array);
		System.out.println("my second max number in the array " +myVal);
		int mySeconMinValue = secondMin(array);
		System.out.println("My second min value is "+ mySeconMinValue);
	}

	public int findScondMax(int arr[]) {
		int max = arr[0];
		int secondMax = arr[1];
		
		for(int index = 0; index<arr.length;index++) {
			
			if( arr[index] > max ) {
				secondMax =max;
				max = arr[index];	
			}
			else if (arr[index] >secondMax && arr[index]<max) {
				secondMax = arr[index];
				
			}
			
		}
		return secondMax;
		
	}
	public static int secondMin(int[] array ) {
		
		int min = array[0];
		int seconMin = array[1];
		
		for(int i = 0; i<array.length;i++) {
			
			if(array[i] < min) {
				seconMin = min;
				min = array[i];
			}else if (array[i] < seconMin && array[i] > min ) {
				seconMin =  array[i];
				
			}
			
		}
		
		return seconMin;
		
	}
}
