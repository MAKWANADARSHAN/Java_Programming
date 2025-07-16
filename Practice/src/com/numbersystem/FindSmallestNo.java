package com.numbersystem;

public class FindSmallestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15, num2 = 73, num3 = 14;
		int result = (num1 < num2) ? (num1 < num3) ? num1 : num3 : (num2 < num3) ? num2 : num3;
		System.out.println(result);
	}

}
