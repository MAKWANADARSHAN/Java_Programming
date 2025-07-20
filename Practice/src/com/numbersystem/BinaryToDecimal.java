package com.numbersystem;

public class BinaryToDecimal {

	public static int binToDec(int num) {
		int sum = 0;
		int count = 0;
		while (num > 0) {
			sum = sum + (num % 10 * (int) Math.pow(2, count));
			num /= 10;
			count++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 1101;
		System.out.println(binToDec(n));
	}

}
