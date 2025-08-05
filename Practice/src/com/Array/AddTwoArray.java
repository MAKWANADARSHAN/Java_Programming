package com.Array;

import java.util.Arrays;

public class AddTwoArray {
	static int[] addArray(int[] a, int b[]) {
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];

		}
		return c;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int[] b = { 100, 200, 300, 400 };
		System.out.println(Arrays.toString(addArray(a, b)));
	}
}
