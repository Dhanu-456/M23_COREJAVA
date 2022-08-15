package com.capgemini.inheritance;
class AndroidVersion
{
	void display()
	{
		System.out.println("Android-Version");
	}
}
class Kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Kitkat");
	}
}
class Pie extends Kitkat
{
	void print1()
	{
		System.out.println("Pie");
	}
}
public class HierchicalInheritance {

	public static void main(String[] args) {
		Kitkat k = new Kitkat();
		Pie p = new Pie();
		k.print();
		k.display();
		p.print1();
		

	}

}
