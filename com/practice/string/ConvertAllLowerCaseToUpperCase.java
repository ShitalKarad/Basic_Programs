package com.practice.string;

public class ConvertAllLowerCaseToUpperCase {
	

	public static void main(String[] args) {
		String str ="Shital";
		StringBuffer newStr = new StringBuffer(str);
				
		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isLowerCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				
			}
			
		}
		System.out.println("String after conversion " +newStr);
	}
}
