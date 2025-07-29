package com.Array;

public class FindMinNumber {
	public static void main(String[] args) {
		int a[] = { 10, 9, 17, 8, 16, 5 };
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
