package com.capgemini.String;

public class StringBuffDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Internet of Things");
		System.out.println(sb.capacity());
		sb = new StringBuffer(" ");
		System.out.println(sb.capacity());

	}
}
