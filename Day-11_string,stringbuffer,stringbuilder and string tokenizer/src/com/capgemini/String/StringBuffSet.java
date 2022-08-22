package com.capgemini.String;

public class StringBuffSet {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1, 'B');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		

	}
}
