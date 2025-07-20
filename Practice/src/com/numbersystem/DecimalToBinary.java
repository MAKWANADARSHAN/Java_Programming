package com.numbersystem;

public class DecimalToBinary {
	public static void main(String[] args) {
		int dec = 14;
		System.out.println(decToBin(dec));
	}

	public static String decToBin(int n) {

		String bin = "";
		while (n > 0) {
			bin = n % 2 + bin;
			n /= 2;
		}
		return bin;
	}
}
