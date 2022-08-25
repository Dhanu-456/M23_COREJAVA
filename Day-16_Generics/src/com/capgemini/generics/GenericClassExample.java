package com.capgemini.generics;

public class GenericClassExample<T>
{
	T num;
	public void show()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		GenericClassExample<Double>obj=new GenericClassExample<>();
		obj.num=13.8;
		obj.show();

	}

}
