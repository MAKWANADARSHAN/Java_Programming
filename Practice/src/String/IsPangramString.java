package String;

import java.util.HashSet;

public class IsPangramString {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPangram1(s));
	}

	static boolean isPangram(String s) {
		s = s.toLowerCase();
		HashSet hs = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) // s.charAt(i)>='a'&&s.charAt(i)<='z'
				hs.add(s.charAt(i));
		}
		return hs.size() == 26;
	}

	static boolean isPangram1(String s) {
		s = s.toLowerCase();
		boolean[] b = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				b[ch - 97] = true;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == false)
				return false;
		}
		return true;
	}
}
