package com.numbersystem;

public class ReverseNumber {
	static int reversenum(int num) {
		int revnum = 0;
		while (num > 0) {
			int tem = num % 10;
			revnum = revnum * 10 + tem;
			num /= 10;

		}
		return revnum;
	}

	public static void main(String[] args) {

		int revnum = reversenum(21313);
		System.out.println(revnum);
	}
}
