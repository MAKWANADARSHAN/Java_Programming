package com.prectice;

public class checkDate {
	public static void main(String[] args) {
		int date = 1, month = 10, year = 2012;
		if (date < 1 || date > 31 || month > 12 || month < 1 || year < 1) {
			System.out.println("invalid Date..");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			System.out.println("invalid date..");
		} else if (!(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) && month == 2 && date > 28)

		{
			System.out.println("invalid date");
		} else if ((year % 4 == 0 && year % 100 == 0 || year % 400 == 0) && month == 2 && date > 29) {
			System.out.println("invalid date");
		} else {
			System.out.println("valid date");
		}
	}
}
