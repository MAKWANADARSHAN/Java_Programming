package com.Pattern;

public class Pattern51 {
	public static void main(String[] args) {
		int n = 7;
		int x = 4;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= x; j++) {
				System.out.print("* ");

			}
			if (i <= n / 2) {
				x--;
			} else {
				x++;
			}
			System.out.println();
		}
	}
}
