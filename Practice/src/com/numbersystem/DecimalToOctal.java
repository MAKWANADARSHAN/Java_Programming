package com.numbersystem;

public class DecimalToOctal {
	public static void main(String[] args) {
		int dec = 64;
		System.out.println(decToOct(dec));

	}

	public static String decToOct(int n) {

		String oct = "";
		while (n > 0) {
			oct = n % 8 + oct;
			n /= 8;
		}
		return oct;
	}
}
