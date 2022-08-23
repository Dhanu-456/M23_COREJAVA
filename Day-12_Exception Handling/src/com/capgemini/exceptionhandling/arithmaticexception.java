package com.capgemini.exceptionhandling;

import java.util.Scanner;

public class arithmaticexception {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		int res= 0;
try
{
	int a=15;
	System.out.println("Enter the value of B: ");
	int b=s.nextInt();
	res=a/b;
}
catch(Exception e)
{
	System.out.println("Exception Handled" +e);

}
System.out.println(res);
s.close();
}

}
