package com.Pattern;

public class Pattern38 {
	public static void main(String[] args) {
		int n = 5;
		int m = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == m + 1 || j == m + 1 || (i == 1 && j > m) || (i == n && j <= m) || (j == 1 && i <= m)
						|| (j == n && i > m)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
