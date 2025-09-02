package Array;

public class SumofOddIndexElement {
	public static void main(String[] args) {
		int a[] = { 10, 9, 7, 8, 6, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				sum += a[i];
			}
		}
		System.out.println(sum);
	}
}
