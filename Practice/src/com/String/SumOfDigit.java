package com.String;

public class SumOfDigit {
	public static void main(String[] args) {
		String s = "a3c2b1a";
		char ch[] = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) // ch[i]>='0'&&ch[i]<='9'
				sum += ch[i] - 48;
		}
		System.out.println(sum);
	}
}
