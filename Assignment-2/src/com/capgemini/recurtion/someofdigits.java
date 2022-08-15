package com.capgemini.recurtion;

import java.util.Scanner;

public class someofdigits {

	  static int someofdigit(int n)
	 {
		 if (n==0)
			 return 0;
		 else
			 return (n % 10 + someofdigit(n/10));
		 
	 }
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = someofdigit(n);
		System.out.println("Sum of Digits:" + result);
		s.close();

	}

}
