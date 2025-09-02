package Array;

import java.util.Arrays;

public class ReverseArray {
	static int[] reverse(int a[]) {
		int first = 0, last = a.length - 1;
		while (first < last) {
			int tem = a[last];
			a[last] = a[first];
			a[first] = tem;
			first++;
			last--;
		}
		return a;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 4 };
		reverse(arr);
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		System.out.println(Arrays.toString(arr));

	}
}
