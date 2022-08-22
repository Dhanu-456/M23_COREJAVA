package com.capgemini.String;

public class StringBuilderExample2 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String s = "Rohit sharma";
		StringBuilder sb = new StringBuilder("s.length");
		//Capacity method is used with StringBuffer not with String
		System.out.println(sb.capacity());


	}
}
