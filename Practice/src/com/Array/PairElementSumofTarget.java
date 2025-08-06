package com.Array;

public class PairElementSumofTarget {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int target = 8;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + "  " + a[j]);
				}
			}
		}
	}
}
