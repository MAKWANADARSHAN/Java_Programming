package String;

public class IsUnique {
	public static void main(String[] args) {
		String s1 = "abcd";
		System.out.println(isUnique(s1));
	}

	static boolean isUnique(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
//		s = s.toLowerCase();
//		HashSet hS = new HashSet();
//		for (int i = 0; i < s.length(); i++) {
//			hS.add(s.charAt(i));
//		}
//		return s.length() == hS.size();
	}
}
