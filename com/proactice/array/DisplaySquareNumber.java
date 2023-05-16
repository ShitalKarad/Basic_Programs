package com.proactice.array;

public class DisplaySquareNumber {
	
	public static boolean squarRoot(int number) {
		
		for(int i=2;i<=number/2;i++) {
			if(i*i==number){
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		
		for (int i = 0; i < arr.length; i++) {

			if(squarRoot(arr[i]))
				System.out.println(arr[i]);
		}
	}

}
