package TwoDArray;

public class SumOfDiagonalElement {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j)
					sum1 += a[i][j];
				if (i + j == a.length - 1)
					sum2 += a[i][j];
			}
		}
		System.out.println("primary  :" + sum1);
		System.out.println("secndary :" + sum2);
	}
}
