package com.rfp;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int output = isPrime(num);

	}

	public static int isPrime(int n) {

		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}

		}
		if (count == 1) {
			System.out.println("Given nunber is prime number " + n);

		} 
		else {
			System.out.println("Given nunber is not a prime number " + n);
		}

		return n;
	}
}
