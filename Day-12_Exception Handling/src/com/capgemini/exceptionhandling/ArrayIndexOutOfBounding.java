package com.capgemini.exceptionhandling;

public class ArrayIndexOutOfBounding 
{
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
		System.out.println("Forth element successfully displyed");
		}

    public static void main(String[] args)
    {
		System.out.println("First line");
		System.out.println("Second line");
		try
		{
			int[] myintArray = new int[]{1,2,3};
			print(myintArray);
			}
			catch(Exception e)
			{
				System.out.println(e);
				}
			System.out.println("Third line");

			
		}


		

	}


