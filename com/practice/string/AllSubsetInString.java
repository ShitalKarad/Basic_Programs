package com.practice.string;

import java.lang.reflect.Array;

public class AllSubsetInString {
	public static void main(String[] args) {
		String str = "abc";
		String[] input = subset(str);
		System.out.println("Possible subsets are");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
	}
	public static String[] subset(String str) {
		
		int len = str.length();
		int temp = 0;
		String strArray[] = new String[len*(len+1)/2];
		
		for (int i = 0; i <len; i++) {
			
			for(int j = i; j<len;j++) {
				
				strArray[temp] = str.substring( i,j+1);
				temp++;
			}
			
		}
		
		
		return strArray;
		
	}

}
