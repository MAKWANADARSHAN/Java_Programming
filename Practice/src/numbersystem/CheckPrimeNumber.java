package numbersystem;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		boolean check = isPrime(num);
		if (check == true) {
			System.out.println(num + " is a Prime Number...");
		} else {
			System.out.println(num + " is not a Prime Number...");
		}
	}
}
