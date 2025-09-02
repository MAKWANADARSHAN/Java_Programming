package Recursion;

public class SumOfDigit {
	static int sumofDigit(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 10 + sumofDigit(n / 10);
	}

	public static void main(String[] args) {
		int num = 123;
		System.out.println(sumofDigit(num));
	}
}
