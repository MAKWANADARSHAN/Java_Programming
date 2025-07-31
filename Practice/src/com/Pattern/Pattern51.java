package com.Pattern;

public class Pattern51 {
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			int x;
			if (i <= n / 2 + 1) {
				x = i;
			} else {
				x = n / 2 + 5 - i;
			}
			for (int j = 1; j <= x; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
