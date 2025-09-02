package Array;

public class LinearSearch {
	static int linearSearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int num = 50;
		int index = linearSearch(a, num);
		if (index >= 0) {
			System.out.println("Number is found in index : " + index);
		} else {
			System.out.println("Number is not found...");
		}
	}
}
