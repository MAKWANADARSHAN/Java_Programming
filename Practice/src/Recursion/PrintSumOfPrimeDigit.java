package Recursion;

public class PrintSumOfPrimeDigit {
	static int sumofPrime(int n) {
		if (n == 0)
			return 0;
		int rem = n % 10;
		if ((rem) == 2 || (rem) == 3 || (rem) == 5 || (rem) == 7)
			return rem + sumofPrime(n / 10);

		return sumofPrime(n / 10);
	}

	public static void main(String[] args) {
		int num = 15932;
		System.out.println(sumofPrime(num));
	}
}
