package TwoDArray;

public class PrintPrimeNumber {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					return false;

			}
			return true;

		}
	}

	public static void main(String[] args) {
		int a[][] = { { 10, 2, 30 }, { 40, 5, 19 }, { 7, 80, 11 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (isPrime(a[i][j]))
					System.out.println(a[i][j]);
			}
		}
	}
}
