package String;

public class String2 {
	public static void main(String[] args) {
		String s1 = "ab12cd34ef";
		String s2 = "";
		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isDigit(ch)) {

				s2 += words[ch - '0'];

			} else {
				s2 += ch;
			}
		}
		System.out.println(s2);
	}
}
