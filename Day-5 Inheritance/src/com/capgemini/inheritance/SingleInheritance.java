package com.capgemini.inheritance;
class Parent
{
	protected int roll_no;
	void print ()
	{
		System.out.println("Hey Guys! What's going on?");
	}
}

class Child extends Parent
{
	void accept()
	{
		System.out.println("rollno is : " +roll_no);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.roll_no=121;
		c.accept();
		c.print();

	}

}
