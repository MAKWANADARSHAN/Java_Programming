package TwoDArray;

public class FinBigestElement {
	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int big = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > big)
					big = a[i][j];
			}
		}
		System.out.println(big);
	}
}
