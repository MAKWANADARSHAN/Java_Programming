package com.String;

public class CountVowelsEachWord {
	public static int countVowels(String word) {
		int count = 0;
		for (int j = 0; j < word.length(); j++) {
			if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o'
					|| word.charAt(j) == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		String s1 = "Ram is Good";
		s1 = s1.toLowerCase();
		String word = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				word += s1.charAt(i);
			} else {

				System.out.println(word + " " + countVowels(word));
				word = "";
			}
		}
		System.out.println(word + " " + countVowels(word));
	}
}
