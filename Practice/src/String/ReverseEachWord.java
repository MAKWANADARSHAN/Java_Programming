package String;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "Ram is God";

//		String[] s1 = s.split("");
//		String rever = "";
//		for (int i = 0; i < s1.length; i++) {
//			String r = (s1[i]);
//			rever = rever + r + "";
//		}
//		System.out.println(rever);

		String main = "", word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word += s.charAt(i);
			} else {
				main += reverse(word) + " ";
				word = "";
			}
		}
		main += reverse1(word);
		System.out.println(main);

	}

	static String reverse(String s1) {
		char[] ch = s1.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			char tem = ch[i];
			ch[i] = ch[j];
			ch[j] = tem;
			i++;
			j--;
		}
		return new String(ch);
	}

	static String reverse1(String s1) {
		return new StringBuffer(s1).reverse().toString();
	}
}
