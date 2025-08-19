package com.String;

public class String2 {
	public static void main(String[] args) {
		String s1 = "ab12cd34ef";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				switch (s1.charAt(i)) {
				case '0': {
					s2 += "zero";
					break;
				}
				case '1': {
					s2 += "one";
					break;
				}
				case '2': {
					s2 += "two";
					break;
				}
				case '3': {
					s2 += "three";
					break;
				}
				case '4': {
					s2 += "four";
					break;
				}
				case '5': {
					s2 += "five";
					break;
				}
				case '6': {
					s2 += "six";
					break;
				}
				case '7': {
					s2 += "seven";
					break;
				}
				case '8': {
					s2 += "eight";
					break;
				}
				case '9': {
					s2 += "nine";
					break;
				}
				}
			} else {
				s2 += s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
