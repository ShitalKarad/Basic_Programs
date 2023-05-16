package com.proactice.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintArrayReverseUsingTempArray {
	public static void main(String[] args) {
		
		int array[] = {10,20,40,50,6,7};
		int temp[] = new int[array.length];
		int count = 0;
		
		System.out.println("my original array is " );
		System.out.print("[");
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.print("]");
		
//		System.out.println("my original array  is " + Arrays.toString(array));
		
		for(int i=array.length-1;i>=0;i--){
			
			temp[count++] = array[i];
			
		}
		array = temp;
		System.out.println("\n my revese array using temp is \n" + Arrays.toString(array));
	}

}
