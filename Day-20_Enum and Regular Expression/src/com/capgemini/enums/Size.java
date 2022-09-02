package com.capgemini.enums;

public enum Size implements PizzaSize
{
SMALL,MEDIUM,LARGE,EXTRALARGE;
	@Override

	public void size()
	{
	System.out.println("Size is:" +this);
	}
		
	
}
