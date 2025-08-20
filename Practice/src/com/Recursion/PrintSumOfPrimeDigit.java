package com.Recursion;

public class PrintSumOfPrimeDigit {
	static int sumofPrime(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) == 2 || (n % 10) == 3 || (n % 10) == 5 || (n % 10) == 7)
			return 1 + sumofPrime(n / 10);
		return sumofPrime(n / 10);
	}

	public static void main(String[] args) {
		int num = 15932;
		System.out.println(sumofPrime(num));
	}
}
