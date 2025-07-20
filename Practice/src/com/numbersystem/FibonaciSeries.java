package com.numbersystem;

import java.util.Scanner;

public class FibonaciSeries {
	public static void fibonaci(int num) {
		int first = 0;
		int second = 1;
		int sum = 1;
		int count = 1;
		System.out.println("0");
		while (true) {

			System.out.println(sum);
			count++;
			sum = first + second;
			first = second;
			second = sum;
			if (count == num) {
				break;
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		// fibonaci(num);
		methos(num);
	}

	static void methos(int num) {
		int first = 0, second = 1;

		for (int i = 1; i <= num; i++) {
			System.out.println(first);
			int sum = first + second;
			first = second;
			second = sum;
		}

	}
}
