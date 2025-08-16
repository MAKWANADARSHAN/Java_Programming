package com.Array;

import java.util.Arrays;

public class ShiftElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 2;
		for (int j = 1; j <= k; j++) {

			int initial = a[0];
			for (int i = 1; i < a.length; i++) {
				a[i - 1] = a[i];
			}
			a[a.length - 1] = initial;
		}
		System.out.println(Arrays.toString(a));
	}
}
