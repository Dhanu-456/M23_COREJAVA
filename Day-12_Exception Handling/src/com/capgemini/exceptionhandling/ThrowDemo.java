package com.capgemini.exceptionhandling;

public class ThrowDemo
{
public static void display(int age , int weight)
{
	if(age>18 && weight>45)
		System.out.println("Eligible to donate the blood");
	else
	{
		throw new RuntimeException("Exception Caught");
	}
}
public static void main(String args[]) throws Exception
{
	try
	{
		display(24,55);
	}
	catch(RuntimeException e)
	{
		System.out.println(e);
	}
}
}
