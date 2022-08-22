package com.capgemini.String;

import java.util.Scanner;

public class StringUsingNew {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = new String(s.nextLine());
		System.out.println(str);
        s.close();
	}
}
