package com.String;

public class FindMostRepitedChar {
	public static void main(String[] args) {
		String s1 = "abcaacdbdbcc";
		char max = ' ';
		int n = 0;
		char[] ch = s1.toCharArray();
		boolean[] b = new boolean[s1.length()];
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s1.length(); j++) {
					if (ch[i] == ch[j]) {
						b[j] = true;
						count++;

					}
					if (count > n) {
						max = ch[i];
						n = count;
					}
				}

			}
		}
		System.out.println(max);
	}
}
