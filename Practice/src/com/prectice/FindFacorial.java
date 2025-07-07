package com.prectice;

import java.util.Scanner;

public class FindFacorial {

	static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		int number = factorial(num);
		System.out.println("factorial of " + number);

	}
}
