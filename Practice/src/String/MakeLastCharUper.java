package String;

public class MakeLastCharUper {
	public static void main(String[] args) {
		String s = "ram is God";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				if (Character.isLowerCase(ch[i])) {
					ch[i] = Character.toUpperCase(ch[i]);
				}
			} else if (Character.isUpperCase(ch[i])) {
				{
					ch[i] = Character.toLowerCase(ch[i]);
				}
			}
		}
		System.out.println(ch);
	}
}
