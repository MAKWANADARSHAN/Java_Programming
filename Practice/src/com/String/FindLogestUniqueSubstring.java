package com.String;

import java.util.HashSet;

public class FindLogestUniqueSubstring {
	public static String longestUniqueSubstring(String s) {
		int n = s.length();
		int maxLength = 0, start = 0, end = 0;
		HashSet<Character> set = new HashSet<>();
		int left = 0, right = 0;

		while (right < n) {
			char c = s.charAt(right);
			if (!set.contains(c)) {
				set.add(c);
				if ((right - left + 1) > maxLength) {
					maxLength = right - left + 1;
					start = left;
					end = right;
				}
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}
		return s.substring(start, end + 1);
	}

	public static void main(String[] args) {
		String input = "abcabcbbghjkl";
		String result = longestUniqueSubstring(input);
		System.out.println("Longest unique substring: " + result);
	}
}
