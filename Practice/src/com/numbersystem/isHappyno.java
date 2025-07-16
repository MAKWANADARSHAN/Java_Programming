package com.numbersystem;

import java.util.Scanner;

public class isHappyno {

	public static boolean ishappy(int num) {

		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum = sum + rem * rem;
				num /= 10;
			}
			num = sum;
		}
		return num == 1 || num == 7;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");

		int n = sc.nextInt();

		if (ishappy(n)) {
			System.out.println(n + " is a Happy number");
		} else {
			System.out.println(n + " is not a Happy number");
		}

	}
}
