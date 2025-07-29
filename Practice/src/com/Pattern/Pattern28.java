package com.Pattern;

public class Pattern28 {
	public static void main(String[] args) {

		int m = 5;

		for (int i = m; i >= 1; i--) {
			for (int j = 1; j <= m - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
