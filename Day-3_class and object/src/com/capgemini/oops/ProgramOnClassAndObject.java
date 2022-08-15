package com.capgemini.oops;
// Program on how to create a class

class car {
	// variable
	int a = 45 ;  
	
	// user define method
	void display() 
	{
		System.out.println("Welcome to M23 Batch");
	}
	
}
public class ProgramOnClassAndObject {
	public static void main(String[] args) {
	// Object Creation
	car xyz = new car();
	// Accessing the car class method
	xyz.display();
	System.out.println(xyz.a);
	}

}
