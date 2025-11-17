package numbersystem;

import java.util.Scanner;

public class FindNthNumberPrime {

	static boolean isPrime(int n) {
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int count = 0;
		int i = 2;

		while (true) {
			if (isPrime(i)) {
				count++;
			}
			if (n == count) {
				System.out.println(n + " th prime number is : " + i);
				break;
			}
			i++;
		}

	}
}
