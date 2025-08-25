package com.numbersystem;

public class CountDigit {

	public static int countDig(int numumber) {
		int num = numumber;
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int count = countDig(2121);
		System.out.println(count);
	}
}
