package Recursion;

public class ProductofDigit {
	static int productofDigit(int n) {
		if (n == 0) {
			return 1;
		}
		return n % 10 * productofDigit(n / 10);
	}

	public static void main(String[] args) {
		int num = 223;
		System.out.println(productofDigit(num));
	}
}
