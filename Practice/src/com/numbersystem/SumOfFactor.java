package com.numbersystem;

import java.util.Scanner;

public class SumOfFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				// System.out.println(i);
				sum += i;
			}

		}
		sum += num;
		System.out.println("The sum of all factor is :" + sum);
	}
}
