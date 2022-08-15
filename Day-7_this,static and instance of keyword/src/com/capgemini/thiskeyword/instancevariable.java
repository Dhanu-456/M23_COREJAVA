package com.capgemini.thiskeyword;
class X
{
	int m1, m2;
	public void print(int m1, int m2)
	{
		this.m1 = m1;
		this.m2 = m2;		
	}
	public void display ()
	{
		System.out.println("Addition of m1 and m2 is:" + (m1+m2));
	}
	
}

public class instancevariable {

	public static void main(String[] args) {
		X obj = new X();
		obj.print(20,25);
		obj.display();

	}

}
