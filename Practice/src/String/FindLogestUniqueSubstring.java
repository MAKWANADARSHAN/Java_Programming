package String;

public class FindLogestUniqueSubstring {

	static boolean isUnique(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String s1 = "scanner";
		String s2 = "";
		int length = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j <= s1.length(); j++) {
				String sub = s1.substring(i, j);
				if (isUnique(sub)) {
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
