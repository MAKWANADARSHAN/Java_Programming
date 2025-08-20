package com.Recursion;

public class FindGCD {
	static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;

		System.out.println(gcd(num1, num2));

	}
}
