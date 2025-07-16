package com.numbersystem;

import java.util.Scanner;

public class SumOfStrong {

	static boolean isStrong(int num) {
		int orgnum = num;
		int factsum = 0;
		while (num > 0) {
			int tem = num % 10;
			int fact = FindFacorial.factorial(tem);
			factsum += fact;
			num /= 10;
		}
		if (factsum == orgnum) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (isStrong(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
