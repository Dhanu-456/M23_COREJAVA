package com.capgemini.java;

import java.util.Scanner;

public class DoubleRunTime {

	public static void main(String[] args) {
		System.out.println("Enter the value of x:");
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		System.out.println(x);
		s.close();
	}

}
