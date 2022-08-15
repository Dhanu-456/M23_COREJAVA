package com.capgemini.FinalKeyword;
class A
{
	A()
	{
		System.out.println("Constructor");
		
	}

	 public void accept()
	{
		System.out.println("Parent Class");
	}
}

class B extends A
{
	public void accept()
	{

		System.out.println("Child Class");
	}
}
public class finalmethod {

	public static void main(String[] args) {
		B b =new B();
		b.accept();

	}

}
