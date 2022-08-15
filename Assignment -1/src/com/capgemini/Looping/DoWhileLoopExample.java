package com.capgemini.Looping;

import java.util.Scanner;

//Program to print odd natural numbers
public class DoWhileLoopExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		do
		{
			System.out.print( 2*n+1 + " ");
			n++;
		}while (n<20);	
        
		s.close();
	}   

}
