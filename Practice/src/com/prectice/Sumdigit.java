package com.prectice;

public class Sumdigit {

	static int SumOfDigit(int num) {
		int sum = 0;
		while (num > 0) {
			int tem = num % 10;
			sum = sum + tem;
			num /= 10;

		}
		return sum;
	}

	public static void main(String[] args) {

		int revnum = SumOfDigit(2131);
		System.out.println(revnum);
	}
}
