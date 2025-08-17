package com.String;

public class NthDuplicateChar {
	public static void main(String[] args) {
		String s1 = "abaacdbdbcc";

		boolean[] b = new boolean[s1.length()];
		int n = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s1.length(); j++) {
					if (s1.charAt(i) == s1.charAt(j)) {
						b[j] = true;
						count++;

					}
				}
				if (count > 1) {
					System.out.println(s1.charAt(i) + " - " + count);
					n++;
				}
				if (n == 3)
					break;
			}
		}
	}
}
