package com.practice.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "shital";
		System.out.println("Original String is " +str);
		
		String revStr = reverseString(str);
		
		System.out.println("Reverse String is "+revStr);
	
	}
	public static String reverseString(String str) {
		
		char ch[] = str.toCharArray();
		String rev = "";
		
		for (int i= ch.length-1; i>=0; i--) {
			rev += ch[i];
			
		}
		
		return rev;
		
	}
	

}
