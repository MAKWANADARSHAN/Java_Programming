package com.Array;

import java.util.Arrays;

public class AddTwoArray {
	static int[] addArray(int[] a, int b[]) {
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int x = 0;
		for (int i = a.length; i < a.length + b.length; i++) {
			c[i] = b[x];
			x++;
		}
		return c;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int[] b = { 100, 200, 300 };
		System.out.println(Arrays.toString(addArray(a, b)));
	}
}
