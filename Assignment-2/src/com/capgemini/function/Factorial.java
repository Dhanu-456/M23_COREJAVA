package com.capgemini.function;

import java.util.Scanner;

public class Factorial {
	
	static int factorial (int n)
	{
		int i, fact = 1;
		for ( i =1; i<=n; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(factorial(n));
		

	}

}
