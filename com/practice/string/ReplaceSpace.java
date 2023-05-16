package com.practice.string;

public class ReplaceSpace {
	
	public static void main(String[] args) {
		
		String str = "Shital Vishal karad";
		char ch = '-';
		str = str.replace(' ', ch);    
		
		System.out.println("String after replacing space: "+str);
		
	}

}
