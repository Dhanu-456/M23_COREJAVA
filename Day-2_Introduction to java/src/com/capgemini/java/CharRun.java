package com.capgemini.java;

import java.util.Scanner;

public class CharRun {

	public static void main(String[] args) {
		System.out.println("Enter the value of x:");
		// run time input
		
		Scanner s = new Scanner (System.in);
		char x = s.next().charAt(0);
		System.out.println("The Char is :" + x);
		s.close();
	}

}
