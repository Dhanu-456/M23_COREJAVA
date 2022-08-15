package com.capgemini.polymorphism;
//Program on method overriding
class Division
{
	void display (int a, int b)
	{
		System.out.println(a/b);
	}
}
class Div extends Division
{
	void display(int x, int y)
	{
		System.out.println(x/y);
	}
}
public class MethodOverrinding {

	public static void main(String[] args) {
		Div d = new Div();
		d.display(12, 2);
		Division d1 = new Division();
		d1.display(16, 4);

	}

}
