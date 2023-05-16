package com.proactice.array;

public class FindMinnCharacterInArray {
	
	public static void main(String[] args) {
		
		char array[] = {'Z', 'D', 'E', 'x', 'A', 'R'};
		
		char min = array[0];
		
		for(int c = 0; c<array.length;c++) {
			if(array[c] < min) {
				min = array[c];
			}
		}
		System.out.println("min character in an array is " +min);
	}

}

