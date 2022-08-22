package com.capgemini.String;

public class StringBuffExample {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String s = "DHANU";
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.capacity());
}
}
