package com.Array;

public class LinearSearch {
	static boolean linearSearch(int[] a, int n) {
		for (int i : a) {
			if (i == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int num = 5;
		if (linearSearch(a, num)) {
			System.out.println("numner are found");
		} else {
			System.out.println("Number are not found");
		}
	}
}
