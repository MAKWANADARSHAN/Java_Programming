package com.numbersystem;

public class CheckNumberDigitOdd {

	static boolean oddDigit(int num) {

		while (num > 0) {
			int tem = num % 10;
			if (tem % 2 == 0) {
				return false;
			} else {
				num /= 10;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 137;
		if (oddDigit(num)) {
			System.out.println("all digit are odd");
		} else {
			System.err.println("all digit are not odd");
		}
	}
}
