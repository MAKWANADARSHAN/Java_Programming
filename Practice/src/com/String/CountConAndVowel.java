package com.String;

public class CountConAndVowel {
	public static void main(String[] args) {
		String s = "Abc de";
		s = s.toLowerCase();
		int cc = 0;
		int cv = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {

				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					cv++;
				} else {
					cc++;
				}
			}
		}
		System.out.println("con " + cc);
		System.out.println("vow " + cv);
	}
}
