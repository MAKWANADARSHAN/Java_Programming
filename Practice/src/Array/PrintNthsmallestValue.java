package Array;

import java.util.Arrays;
import java.util.HashSet;

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
		int a[] = { 10, 20, 10, 30, 20, 50, 10 };
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a) {
			hs.add(i);
		}
		// System.out.println(hs);
		int b[] = new int[hs.size()];
		int index = 0;
		for (int ele : hs) {
			b[index] = ele;
			index++;
		}
		// System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		// System.out.println(Arrays.toString(b));

		int n = 1;
		System.out.println(b[n - 1]);
	}
}
