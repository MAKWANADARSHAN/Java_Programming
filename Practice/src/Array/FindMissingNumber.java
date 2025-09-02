package Array;

public class FindMissingNumber {
	static boolean isMissing(int n, int a[]) {
		for (int i : a) {
			if (i == n)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 8, 9 };
		int min = a[0];
		int max = a[0];
		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}

		for (int j = min + 1; j < max; j++) {
			if (isMissing(j, a))
				System.out.println(j);
		}
	}

}
