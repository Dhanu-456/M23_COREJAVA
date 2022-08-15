package com.capgemini.FinalKeyword;

//final class Fruit
 class Fruit
{
	
	Fruit()
	{
		System.out.println("Constructor");
		
	}
     
	 public void accept()
	{
		System.out.println("Parent Class");
	}
}

class Apple extends Fruit
{
	public void accept()
	{

		System.out.println("Parent Class");
	}
}
public class finalclass {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.accept();

	}

}
