 package com.practice.string;

public class CountNumberOfCharacterInString {
	public static void main(String[] args) {
		String str = "Shital";
		char String[] = str.toCharArray();
		int count = 0;
		
		for (int i = 0; i < String.length; i++) {
			
			 count++;
		}
		System.out.println("number of char in string is "+count);
	}

}
