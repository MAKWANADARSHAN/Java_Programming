package Recursion;

public class CountEvenDigit {
	static int evenCount(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) % 2 == 0)
			return 1 + evenCount(n / 10);
		return evenCount(n / 10);
	}

	public static void main(String[] args) {
		int num = 25628;
		System.out.println(evenCount(num));
	}
}
