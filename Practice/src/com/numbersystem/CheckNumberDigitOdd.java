package com.numbersystem;

public class CheckNumberDigitOdd {

	static boolean oddDigit(int num) {

		while (num > 0) {
			int tem = num % 10;
			if (num % 10 % 2 == 0) {
				return false;
			} else {
				num /= 10;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 138;
		if (oddDigit(num)) {
			System.out.println(" digit are odd");
		} else {
			System.err.println("digit are not odd");
		}
	}
}
