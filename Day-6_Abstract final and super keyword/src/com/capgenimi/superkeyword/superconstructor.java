package com.capgenimi.superkeyword;
class Android
{
	
	Android()
	
	{
		System.out.println("Lava is Android mobile");
	}
}
class Lava extends Android
{  
	Lava()
	{
		super();
		System.out.println("Hello everyone");
	}
}
public class superconstructor {

	public static void main(String[] args) {
		Lava l = new Lava();
		
	}

}
