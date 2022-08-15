package com.capgemini.oops;
// Program on Non parameterized constructor

class Animal {
	int x;
	
		Animal()       // Non parameterized constructor
	{
		x = 15;
	}	
		void display()
		{
			System.out.println("Lion" + " " + x);
		
	}
	
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		// Object Creation
		Animal ABC = new Animal();
		// Accessing object 
		ABC.display();

	}

}
