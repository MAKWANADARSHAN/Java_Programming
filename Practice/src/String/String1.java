package String;

public class String1 {
	public static void main(String[] args) {
		String s1 = "a2b3c4";
		String s2 = "";
		char a = s1.charAt(0);
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isAlphabetic(s1.charAt(i))) {
				a = s1.charAt(i);
			} else {
				for (int j = 1; j <= s1.charAt(i) - 48; j++) {
					s2 += a;
				}
			}
		}
		System.out.println(s2);
	}
}
