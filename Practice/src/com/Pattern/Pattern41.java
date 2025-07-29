package com.Pattern;

public class Pattern41 {
	public static void main(String[] args) {
		int n = 7;
		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print((char) (k + 64) + " ");
			}
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.out.println();
		}
	}
}
