package com.capgemini.String;

import java.util.Scanner;

public class StringChar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str.charAt(2));
		// No Negative index
		//System.out.println(str.charAt(-2));
		s.close();

	}

}
