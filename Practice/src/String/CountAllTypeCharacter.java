package String;

public class CountAllTypeCharacter {
	public static void main(String[] args) {
		String s1 = "jil@01/*";
		int ac = 0;
		int sc = 0;
		int nc = 0;
//		for (int i = 0; i < s1.length(); i++) {
//			char ch = s1.charAt(i);
//			if (ch >= 'A' && ch <= 'z' || ch >= 'a' && ch <= 'z') {
//				ac++;
//			} else if (ch >= '0' && ch <= '9') {
//				nc++;
//			} else {
//				sc++;
//			}
//		}

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) {
				ac++;
			} else if (Character.isDigit(ch)) {
				nc++;
			} else {
				sc++;
			}
		}
		System.out.println("Total alphabat " + ac);
		System.out.println("Total Numer " + nc);
		System.out.println("Total special character " + sc);

		Character.isAlphabetic(nc);
	}
}
