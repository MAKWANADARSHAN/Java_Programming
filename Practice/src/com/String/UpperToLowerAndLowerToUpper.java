package com.String;

public class UpperToLowerAndLowerToUpper {
	public static void main(String[] args) {
		String str = "AbcdEfG";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) // ch[i] >= 'A' && ch[i] <= 'Z'
			{
				ch[i] = (char) (ch[i] + 32);
			} else if (Character.isLowerCase(ch[i]))// ch[i] >= 'a' && ch[i] <= 'z'
			{
				ch[i] = (char) (ch[i] - 32);
			}

		}
		str = new String(ch);
		System.out.println(str);
	}
}
