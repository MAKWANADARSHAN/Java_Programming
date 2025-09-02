package String;

public class ReverseSentence {
	public static void main(String[] args) {
		String s = "Ram is God";
//		String[] s1 = s.split(" ");
//		String reverse = "";
//		for (int i = s1.length - 1; i >= 0; i--) {
//			reverse += s1[i] + " ";
//		}
//		System.out.println(reverse);

		String main = "", word = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word += s.charAt(i);
			} else {
				main = " " + word + main;
				word = "";
			}
		}
		main = word + main;
		System.out.println(main);
	}

}
