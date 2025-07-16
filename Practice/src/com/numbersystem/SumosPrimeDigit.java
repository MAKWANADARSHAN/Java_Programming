package com.numbersystem;

public class SumosPrimeDigit {
	static int sumOfPrime(int num) {
		int sum = 0;

		while (num > 0)

		{
			int tem = num % 10;
			if (tem == 2 || tem == 3 || tem == 5 || tem == 7) {
				sum += tem;
			}
			num /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int sum = sumOfPrime(12586);
		System.out.println(sum);
	}

}
