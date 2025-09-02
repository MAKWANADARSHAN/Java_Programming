package Array;

public class PrintEvenElement {
	public static void main(String[] args) {
		int a[] = new int[] { 10, 21, 33, 40, 2 };
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}
	}
}
