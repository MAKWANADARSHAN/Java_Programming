package Recursion;

public class ReverseString {
	static String reverse(String s) {
		if (s.isEmpty())
			return s;
		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		System.out.println(reverse(s1));
	}
}
