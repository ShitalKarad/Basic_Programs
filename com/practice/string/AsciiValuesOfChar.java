package com.practice.string;

import java.util.Scanner;

public class AsciiValuesOfChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char input = sc.next().charAt(0);
		
		int i = input;
		
		System.out.println("Ascii value of " +input + "is " +i);
	}
}
