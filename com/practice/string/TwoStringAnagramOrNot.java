package com.practice.string;

import java.util.Arrays;

public class TwoStringAnagramOrNot {
	
	public static boolean checkAanagrams( String str1 , String str2) {
		
		char String1[] = str1.toCharArray();
		char String2[] = str2.toCharArray();
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(str1 != str2)
			return false;
		
		Arrays.sort(String1);
		Arrays.sort(String2);
		
		for (int i = 0; i < n1; i++) 
			if (String1[i] != String2[i]) 
				return true ;
				

		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str1 = "shital";
		String str2 = "vishal";
		
		if (checkAanagrams(str1, str2)) {
			System.out.println("The two string are anagram of each other");
			
		}else {
			System.out.println("The two string are not anagrams of each other ");
		}
	}

}
