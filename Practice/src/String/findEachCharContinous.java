package String;

public class findEachCharContinous {
	public static void main(String[] args) {
		String s1 = "aaaabbcccaa";
//		char ch = s1.charAt(0);
//		int count = 1;
//		for (int i = 1; i < s1.length(); i++) {
//			if (ch == s1.charAt(i)) {
//				count++;
//			} else {
//				System.out.print(ch + "" + count);
//				ch = s1.charAt(i);
//				count = 1;
//
//			}
//		}
//		System.out.print(ch + "" + count);

		char[] ch = s1.toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				count++;
			} else {
				System.out.print(ch[i] + "" + count);
				count = 1;
			}
		}
		System.out.print(ch[ch.length - 1] + "" + count);
	}
}
