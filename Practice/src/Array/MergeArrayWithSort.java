package Array;

import java.util.Arrays;

public class MergeArrayWithSort {
// both array are already sort
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 10, 20, 30 };
		int[] c = new int[a.length + b.length];
		int first = 0;
		int second = 0;
		int main = 0;
		while (first < a.length && second < b.length) {
			if (a[first] < b[second]) {
				c[main++] = a[first++];
			} else {
				c[main++] = b[second++];
			}
		}
		while (first < a.length) {
			c[main++] = a[first++];
		}
		while (second < b.length) {
			c[main++] = b[second++];
		}
		System.out.println(Arrays.toString(c));

	}
}
