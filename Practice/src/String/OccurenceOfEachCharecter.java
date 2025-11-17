package String;

import java.util.HashMap;

public class OccurenceOfEachCharecter {
	public static void main(String[] args) {
		String s1 = "abaacdb";

		boolean[] b = new boolean[s1.length()];

		for (int i = 0; i < s1.length(); i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s1.length(); j++) {
					if (s1.charAt(i) == s1.charAt(j)) {
						b[j] = true;
						count++;

					}
				}
				System.out.println(s1.charAt(i) + " - " + count);
			}
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
		}
		// System.out.println(hm);
	}
}
