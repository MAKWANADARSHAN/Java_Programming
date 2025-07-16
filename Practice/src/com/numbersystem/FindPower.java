package com.numbersystem;

public class FindPower {

	static int power(int p, int q) {
		int res = 1;
		for (int i = 0; i < q; i++) {
			res *= p;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(power(10, 0));
	}
}
