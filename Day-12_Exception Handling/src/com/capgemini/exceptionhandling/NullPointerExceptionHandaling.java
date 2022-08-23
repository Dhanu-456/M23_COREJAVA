package com.capgemini.exceptionhandling;
import java.util.Scanner;


public class NullPointerExceptionHandaling
{

	public static void main(String[] args)
	{
Scanner s=new Scanner(System.in);
String str =s.nextLine();
try
{
	str.equals("JAVA");

}
catch(Exception e)
{  
	System.out.println(e);
	System.out.println(str.equals("Java"));
}
	}

}
