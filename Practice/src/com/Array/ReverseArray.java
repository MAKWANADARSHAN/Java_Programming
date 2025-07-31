package com.Array;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int first = 0, last = arr.length - 1;
		while (first < last) {
			int tem = arr[last];
			arr[last] = arr[first];
			arr[first] = tem;
			first++;
			last--;
		}
		for (int i : arr) {
			System.out.println(i + " ");
		}

	}
}
