package com.capgemini.lamdaexp;

interface A
{
	void print();
}
class B implements A
{
	public void print()
	{
		System.out.println("Functional Implementation Without Lambda Expression");
	}
}
public class FunctionalInterfaceImpl 
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.print();
		

	}

}
