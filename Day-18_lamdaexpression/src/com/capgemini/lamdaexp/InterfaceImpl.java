package com.capgemini.lamdaexp;
interface C
{
	void display();
}
public class InterfaceImpl {

	public static void main(String[] args)
	{
		C obj=()->
		{
			System.out.println("Functional Interface Implementation using Lambda Expression");
		};
		obj.display();

	}

}
