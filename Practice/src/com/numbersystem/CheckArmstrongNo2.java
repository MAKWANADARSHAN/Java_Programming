package com.numbersystem;

class CheckArmstrongNo2 {

	static boolean sumOfDigitUntil(int num) {
		int org = num;
		String Digit = num + "";
		int digit = Digit.length();
		int sum = 0;
		while (num > 0) {
			sum += Math.pow(num % 10, digit);
			num /= 10;

		}
		return sum == org;
	}

	public static void main(String[] args) {
		int n = 153;
		System.out.println(sumOfDigitUntil(n) ? "is Armstrong number" : "is Not");

	}

}
