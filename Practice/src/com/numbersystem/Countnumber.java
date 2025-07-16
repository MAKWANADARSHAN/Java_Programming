package com.numbersystem;

public class Countnumber {

	public static int countNum(int numumber) {
		int num = numumber;
		int count = 0;
		while (num > 0) {
			int rem = num % 10;
			count++;
			num /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int count = countNum(2121);
		System.out.println(count);
	}
}
