package com.numbersystem;

import java.util.Scanner;

public class PrintPrimeNumber {

	static boolean isPrime(int num) {

		if (num <= 1)
			return false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

//		for (int i = 2; i <= num; i++) {
//			boolean isprime = true;
//			for (int j = 2; j <= i / 2; j++) {
//				if (i % j == 0) {
//					isprime = false;
//					break;
//				}
//			}
//			if (isprime) {
//				System.out.println(i);
//			}
	}

}
