package Array;

import numbersystem.CheckPalindromeNo;

public class CountPalindromNumer {
	public static void main(String[] args) {
		int a[] = { 55, 38, 99, 121 };
		int count = 0;
		for (int i : a) {
			if (CheckPalindromeNo.isPalindrom(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}