package com.capgemini.polymorphism;
class shape
{
	int area (int a)
	{   // by changing the number of arguments
		return a*a;
	}
	int area(int a, int b)
	{
		return a*b;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		shape s = new shape();
		s.area(3);
		System.out.println(s.area(3));
		s.area(12, 40);
		System.out.println(s.area(12, 40));

	}

}
