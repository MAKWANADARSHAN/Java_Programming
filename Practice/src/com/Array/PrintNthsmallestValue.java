package com.Array;

public class PrintNthsmallestValue {
	static int[] sortAsc(int a[]) {
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] > a[j]) {
					int tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 50, 10, 30, 10, 40 };
		int n = 2;
		sortAsc(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
