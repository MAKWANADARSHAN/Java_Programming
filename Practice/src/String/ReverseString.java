package String;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "java";
		// first method
//		String rev = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			char ch = s1.charAt(i);
//			rev += ch;
//		}
//		System.out.println(rev);

		// second method
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
		// System.out.println(ch);
		System.out.println(new String(ch));

		// third method
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer rev = sb.reverse();

		String s2 = rev.toString();
		System.out.println(s2);

		// System.out.println(" " + new StringBuffer(s1).reverse().toString());
		// System.out.println(s1.equals(new StringBuffer(s1).reverse().toString()));
	}
}
