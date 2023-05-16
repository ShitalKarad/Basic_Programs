package com.practice.string;

import java.util.Scanner;

public class FindRepeatChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = sc.nextLine();
		
		int count;
		
		char String[] = str.toCharArray();
		
		System.out.println("Duplicates char in string is ");
		
		for(int i = 0; i < String.length;i++) {
			count = 1;
			for(int j=i+1; j<String.length;j++) {
				if(String[i] == String[j]) {
					count++;
					 String[j] = '0';
					
				}
			}
			if(count >= 0 && String[i] !='0') {
				System.out.println(String[i] + " => "+count);
			}
			
		}
		
	}
}
