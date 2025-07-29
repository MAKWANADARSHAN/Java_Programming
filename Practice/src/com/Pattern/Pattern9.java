package com.Pattern;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(n % 2 + " ");
				n++;
			}

			System.out.println();
		}
	}
}
