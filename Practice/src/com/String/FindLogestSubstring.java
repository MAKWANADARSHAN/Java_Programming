package com.String;

public class FindLogestSubstring {

	static boolean isPallindrom(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}

	public static void main(String[] args) {
		String s1 = "abacaba";
		String s2 = "";
		int length = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j <= s1.length(); j++) {
				String sub = s1.substring(i, j);
				if (isPallindrom(sub)) {
					if (sub.length() > length) {
						length = sub.length();
						s2 = sub;
					}
				}
			}
		}
		System.out.println(s2);
	}

}
