package com.capgemini.thiskeyword;
// this() : to invoke current class constructor
class K
{
	public int x;
	K()
	{
		this(34);  // invoking the parameterized constructor
		System.out.println("Default Constructor");
	}
	K (int x)
	{
		System.out.println("Value is:" + x);
	}
}
public class invokeconstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		K obj = new K();

	}

}
