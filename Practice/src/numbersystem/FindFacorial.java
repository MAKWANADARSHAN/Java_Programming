package numbersystem;

import java.util.Scanner;

public class FindFacorial {

	static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

	public static int name(int n) {
		if (n == 1 || n == 0) {
			return 1;

		}
		return n * name(--n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		int number = factorial(num);
//		int numers = name(num);
//		System.out.println("factorial of " + numers);
		System.out.println("factorial of " + number);
	}
}
