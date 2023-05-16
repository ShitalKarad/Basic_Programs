package com.practice.string;

public class OneStringRotationOfOther {
	
	public static void main(String[] args) {
		String str1 ="shitalvishal";
		String str2 = "vishalshital";
		if(checkRotation(str1, str2)) {
			System.out.println("yes "+str2+" is rotation of "+str1);
		}else {
			System.out.println("no "+str2+" is not rotation  "+str1);

			
		}
			
	}
	public static boolean checkRotation(String s1,String s2) {
		
		if(s1.length() != s2.length()) {
			
			return false;
		}
		String s3 = s1 + s2;
		
		if (s3.contains(s2)) 
			return true;
		
		else
			return false;
		
	}
	
}
