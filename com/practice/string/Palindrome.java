package com.practice.string;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "Kayak";
		str = str.toLowerCase();
		
		Boolean ans = isPalindrome(str);
		System.out.println(ans );
		
	}
	
	public static boolean isPalindrome(String str) {
		
		Boolean flag = false;
		
		String rev = "";
		
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
			
		}
		if (str.equals(rev)) {
			flag = true;
			
		}
		return flag;
		
	}

}
