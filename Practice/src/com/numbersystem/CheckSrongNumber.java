package com.numbersystem;

public class CheckSrongNumber {
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
//		return factsum == orgnum;
	}

	public static void main(String[] args) {
		int n = 145;
		if (isStrong(n)) {
			System.out.println(n + " is a Srong Number");
		} else {
			System.out.println(n + " is Not a Strong Number`");
		}
	}

}
