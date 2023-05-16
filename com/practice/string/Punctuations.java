package com.practice.string;

public class Punctuations {
	public static void main(String[] args) {
		int count = 0;
		   
		 String str = "Good Morning! Mr. James Potter. Had your breakfast?";  
	        for (int i = 0; i < str.length(); i++) {  
	                //Checks whether given character is punctuation mark  
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
	            		|| str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
	            	count++;  
	            }  
	        }  
	        System.out.println("Total number of punctuation characters exists in string: " + count);  
	    }  
}
