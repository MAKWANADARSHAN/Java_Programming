package com.TwoDArray;

public class TransposeTheMatrix {

	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int b[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
