package com.practice.string;

public class CountVovelAndConsonant {
	public static void main(String[] args) {
		String str = "This is a really simple sentence";   
		int vovelCount = 0 ;
		int consonantCount = 0 ;
		
		str = str.toLowerCase();
		char String[] = str.toCharArray();
		
		for(int i = 0; i < String.length; i++) {
			if (String[i] == 'a' || String[i] == 'e' || String[i] == 'i' || String[i] == 'o' || String[i] == 'u') {
				vovelCount++;
			}else if (String[i] >= 'a' && String[i] <='z') {     
				consonantCount++;
			}
			
		}
		System.out.println("number of vovel present in string is " +vovelCount);
		System.out.println("Number of consonant is present in above String " +consonantCount);
	}

}
