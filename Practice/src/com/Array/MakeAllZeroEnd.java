package com.Array;

import java.util.Arrays;

public class MakeAllZeroEnd {

	public static void main(String[] args) {
		int[] a = { 1, 0, 3, 0, 5, 6, 0, 8 };
		int ind = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				a[ind++] = a[i];
		}
		for (int i = ind; i < a.length; i++) {
			a[ind++] = 0;
		}
		System.out.println(Arrays.toString(a));
	}

}
