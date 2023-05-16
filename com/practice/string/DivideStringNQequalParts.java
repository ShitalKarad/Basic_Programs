package com.practice.string;

public class DivideStringNQequalParts {

	public static void main(String[] args) {
		String str = "shitalvishal";
		int length = str.length();
		int n = 2;
		int temp = 0;
		int ch = length / n;

		String[] equalStr = new String[n];

		if (length % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			for (int i = 0; i < length; i = i + ch) {
				String part = str.substring(i, i + ch);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}

		}
	}

}
