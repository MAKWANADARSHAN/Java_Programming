package numbersystem;

import java.util.Scanner;

public class isHappyno {

//	static int sumOfEachSqr(int n) {
//		int sum = 0;
//		while (n > 0) {
//			int rem=n%10;
//			sum += rem*rem;
//			n /= 10;
//		}
//		return sum;
//	}
//
//	static boolean isHappy(int n) {
//		if (n == 1) {
//			return true;
//		}
//		if (n == 4) {
//			return false;
//		}
//		return isHappy(sumOfEachSqr(n));
//	}

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
