package com.Array;

public class FindMaxNumber {
	public static void main(String[] args) {
		int a[] = { 10, 9, 17, 8, 16, 5 };
		int big = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > big) {
				big = a[i];
			}
		}
		System.out.println(big);
	}
}
