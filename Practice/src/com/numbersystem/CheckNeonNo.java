package com.numbersystem;

public class CheckNeonNo {

	static boolean neonNumber(int num) {
		int square = num * num;
		int sum = 0;
		while (square > 0) {
			int tem = square % 10;
			sum += tem;
			square /= 10;
		}
		if (num == sum)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		int n = 321313;
		if (neonNumber(n))
			System.out.println("this is a neon number");
		else
			System.out.println("this is a not neon number");

	}
}
