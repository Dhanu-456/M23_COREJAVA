package com.capgemini.Array;
import java.util.Arrays;

public class UsingArray
{
	static void display(int...a)
	{
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
		public static void main(String[] args) 
		{
		 display(1,3,4,5,8,45);
		}

}
