package com.Recursion;

public class CountDigit {
	static int count(int n) {
		if (n == 0) {
			return 0;
		}
		return 1 + count(n / 10);
	}

	public static void main(String[] args) {
		int num = 123;
		System.out.println(count(num));
	}
}
