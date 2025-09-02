package String;

public class SwapLastAndFirstChar {
	static String swap(String s) {

		char[] ch = s.toCharArray();
		char temp = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = temp;
		return new String(ch);
	}

	public static void main(String[] args) {
		String s = "Ram is god";

		String main = "", word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word += s.charAt(i);
			} else {
				main += swap(word) + " ";
				word = "";
			}
		}
		main += swap(word);
		System.out.println(main);
	}
}
