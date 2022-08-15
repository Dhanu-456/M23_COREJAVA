package com.capgemini.thiskeyword;
class Main
{
	public int x, y;
	Main()
	{
		x = 10;
		y = 20;
	}
	Main get1()
	{
		return this;
	}
	public void display()
	{
		System.out.println("Addition of x and y is:" + (x+y));
	}
}
public class cuurentclassinstance {

	public static void main(String[] args) {
		Main m = new Main();
		m.get1().display();

	}

}
