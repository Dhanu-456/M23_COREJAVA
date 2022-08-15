package com.capgemini.operators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		Boolean res=a>=b;
		
		System.out.println(res);
		s.close();

	}

}
