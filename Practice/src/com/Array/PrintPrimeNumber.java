package com.Array;

import com.numbersystem.CheckPrimeNumber;

public class PrintPrimeNumber {
//	static boolean isPrime(int n) {
//		if (n <= 1) {
//			return false;
//		}
//		for (int i = 2; i <= n / 2; i++) {
//
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 3, 4, 7, 9 };
		for (int i : a) {
			if (CheckPrimeNumber.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
