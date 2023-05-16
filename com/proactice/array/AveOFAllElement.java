   package com.proactice.array;

public class AveOFAllElement {
	
	public static int findMaxNumber(int arr[]) {
		
		int max = arr[0];
		for(int i = 0; i<arr.length;i++) {	
			if (arr[i] > max) {
				max = arr[i];
			}	
		}
		return max;
	}
	
	public static int findMin(int array[]) {
		
		int min = array[0];
		
		for(int i = 0; i<array.length;i++) {
			if (array[i] < min) {
				min = array[i];
				
			}
		}
		return min;	
	}  
	
	public static void main(String[] args) {
		
		int array[] = {22, 12, 32, 42, 52, 62};
		
		int max = findMaxNumber(array);
		System.out.println("max number " + max);
		
		int min = findMin(array);
		System.out.println("min number is "+min);
		
		int length = array.length;
		
		int sum = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i] == max || array[i] == min) {
			
			}else {
				sum +=array[i];
			}
			
		}
		System.out.println("sum is "+sum);
		int avg = sum/(length-2);
		System.out.println("avg is " +avg);
	}

}
