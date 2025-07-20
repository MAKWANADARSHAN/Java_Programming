package com.numbersystem;

public class NearPrimeNumber {
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					return false;

			}
			return true;

		}
	}

	public static int nearPrimeNo(int n) {
		if (isPrime(n)) {
			return n;
		}
		int pre = n - 1;
		int next = n + 1;
		while (true) {
			if (isPrime(next)) {
				return next;
			} else if (isPrime(pre)) {
				return pre;
			}
			pre--;
			next++;
		}
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(nearPrimeNo(n));
	}
}
