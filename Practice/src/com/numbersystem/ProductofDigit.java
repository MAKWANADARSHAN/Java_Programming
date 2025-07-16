package com.numbersystem;

public class ProductofDigit {
	static int producOfDigit(int num) {
		int product = 1;

		while (num > 0) {
			int tem = num % 10;
			product *= tem;
			num /= 10;
		}

		return product;

	}

	public static void main(String[] args) {
		int product = producOfDigit(1234);
		System.out.println(product);
	}
}
