package com.String;

public class CountEvenLengthWord {
	public static void main(String[] args) {
		String s = "Ram is Go	d";
//		String[] s1 = s.split(" ");
//
//		for (int i = 0; i < s1.length; i++) {
//			if (s1[i].length() % 2 == 0) {
//				System.out.println(s1[i]);
//			}
//
//		}
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word += s.charAt(i);
			} else {
				if (word.length() % 2 == 0) {
					System.out.println(word);
				}
				word = "";
			}
		}
		if (word.length() % 2 == 0) {
			System.out.println(word);
		}

	}
}
