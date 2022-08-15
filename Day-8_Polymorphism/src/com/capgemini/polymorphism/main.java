package com.capgemini.polymorphism;
class Parent
{
	void m1()

   {
	  System.out.println("Parent -m1");
   }
}

public class main extends Parent
{
 
	void m1()
		{
			System.out.println("Child -m1");
		}
		void m2()
		   {
			  System.out.println("Child -m2");
		   }
 
	public static void main(String[] args)
	{
		Parent p = new main();
		p.m1();
		main c = new main();
		c.m2();

	}

}

