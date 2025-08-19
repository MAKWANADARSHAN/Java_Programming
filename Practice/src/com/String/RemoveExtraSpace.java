package com.String;

public class RemoveExtraSpace {
	public static void main(String[] args) {
		String s = "  Ram  is  God  ";
		s = s.trim();
		System.out.println(s.replaceAll("\s+", " "));
	}
}
