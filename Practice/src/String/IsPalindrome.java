package String;

public class IsPalindrome {
	public static void main(String[] args) {

		String s = "abcba";
		System.out.println(isPalindrome(s));
	}

	static boolean isPalindrome(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			if (ch[i] != ch[j])
				return false;
			i++;
			j--;
		}

		return true;
	}
}
