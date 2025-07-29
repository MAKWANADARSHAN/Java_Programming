package com.Pattern;

public class Pattern48 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n * 2 - 1; i++) {
			int x;
			if (i <= n) {
				x = i;
			} else {
				x = n * 2 - i;
			}

			for (int j = 1; j <= x; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
