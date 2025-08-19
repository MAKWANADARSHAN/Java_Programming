package com.String;

import java.util.Arrays;

public class IsAnagram {
	static boolean isAnagram(String s1, String s2) {
		char[] ch1 = s1.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch2);
//		s1 = new String(ch1);
//		s2 = new String(ch2);
		return Arrays.equals(ch1, ch2);
		// return s1.equals(s2);
	}

	static boolean isAnagram1(String s1, String s2) {
		if (s1.length() != s2.length()) {

			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		String s1 = "Cats";
		String s2 = "Act";
		System.out.println(isAnagram1(s1, s2));
	}
}
