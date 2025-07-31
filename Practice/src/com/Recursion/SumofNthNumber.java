package com.Recursion;

public class SumofNthNumber {
	static int sumofNumber(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sumofNumber(n - 1);
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(sumofNumber(num));
	}
}
