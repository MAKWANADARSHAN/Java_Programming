package Array;

import java.util.Arrays;
import java.util.HashSet;

public class PrintNthBiggestValue {
	static int[] removeDuplicate(int[] a) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a) {
			hs.add(i);
		}
		int b[] = new int[hs.size()];
		int index = 0;
		for (int ele : hs) {
			b[index++] = ele;
		}
		Arrays.sort(b);
		return b;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 30, 20, 50, 10 };
		int[] b = removeDuplicate(a);
		int n = 1;
		System.out.println(b[b.length - n]);
	}
}
