package Recursion;

public class Fibonacci {
	static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i < num; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
