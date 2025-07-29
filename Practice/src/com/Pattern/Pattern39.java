package com.Pattern;

public class Pattern39 {
	public static void main(String[] args) {
		/**
		 * int n = 4; for (int i = 1; i <= n; i++) { for (int j = i; j <= n; j++) {
		 * System.out.print(" "); } for (int k = 1; k <= i * 2 - 1; k++) {
		 * System.out.print("* "); } System.out.println(); } for (int i = n - 1; i >= 1;
		 * i--) { for (int j = n; j >= i; j--) { System.out.print(" "); } for (int k =
		 * 1; k <= i * 2 - 1; k++) { System.out.print("* "); } System.out.println(); }
		 **/

		int n = 7;
		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("* ");
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
