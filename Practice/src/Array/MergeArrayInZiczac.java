package Array;

import java.util.Arrays;

public class MergeArrayInZiczac {
	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int first = 0;
		int second = 0;
		int main = 0;
		while (first < a.length && second < b.length) {
			c[main++] = a[first++];
			c[main++] = b[second++];
		}
		while (first < a.length) {
			c[main++] = a[first++];
		}
		while (second < b.length) {
			c[main++] = b[second++];
		}

		return c;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 10, 20, 30 };
		System.out.println(Arrays.toString(merge(a, b)));

	}
}
