package com.practice.string;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		String str = "shi ta l";
		 str = str.replaceAll("\\s+", "");  
		System.out.println(str);
	}
}
