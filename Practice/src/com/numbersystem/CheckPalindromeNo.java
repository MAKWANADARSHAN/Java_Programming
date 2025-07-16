package com.numbersystem;

public class CheckPalindromeNo {
	public static boolean isPalindrom(int num) {
		int orinum = num;
		int revnum = 0;
		while (num > 0) {
			int tem = num % 10;
			revnum = revnum * 10 + tem;
			num /= 10;

		}
		if (revnum == orinum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = 121;
		if (isPalindrom(n)) {
			System.out.println(n + " is a palindrom number");
		} else {
			System.out.println(n + " is a not palindrom number");
		}

	}

}
