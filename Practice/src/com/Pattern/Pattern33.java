package com.Pattern;

public class Pattern33 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i == j || i + j == n + 1) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
