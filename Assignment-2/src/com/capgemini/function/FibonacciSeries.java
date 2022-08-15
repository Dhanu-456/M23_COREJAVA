package com.capgemini.function;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	     int n = s.nextInt();
	     
		int first = 0;
		int second = 1;
		System.out.print(first + " ");
		
		for (int i=1 ; i<n; i++ )
		{
			int next = first + second;
			first = second;
			second = next;
			
			System.out.print(next + " ");
			s.close();
		}
		     
		

	}

} 
