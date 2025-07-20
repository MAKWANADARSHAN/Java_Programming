package com.numbersystem;

public class CheckAutomorphicNo {
	public static boolean isAutomorphic(int num) {

		int square = num * num;

		int rem = (int) Math.pow(10, CountDigit.countDig(num));

		return num == square % rem;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isAutomorphic(25)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
