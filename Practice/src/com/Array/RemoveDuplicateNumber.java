package com.Array;

import java.util.Arrays;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		int size = 1;
		int a[] = { 10, 20, 10, 30, 20, 50, 10 };

		boolean b[] = new boolean[a.length];
		int c[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				c[i] = a[i];
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;

					}
				}

			}
		}
		System.out.println(Arrays.toString(c));
	}

}
