package com.capgemini.Array;

public class Varargs 
{
	static void print(int a,int b, String...s)
	{
		System.out.println(a+ "," + b);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"/t");
		}
		}
	public static void main(String[] args)
	{
		print(13,64,"python","java","c","c++");
		

	}
}


