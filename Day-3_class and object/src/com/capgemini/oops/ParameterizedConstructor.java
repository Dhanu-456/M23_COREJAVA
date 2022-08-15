package com.capgemini.oops;

class Pulser{
	int speed;
	String color;
	
	// Parameterized constructor
	Pulser(int speed , String color)
	{
		this.speed = speed ;
		this.color = color ;
	}
	
	void display()
	{
		System.out.println("Speed is :" + speed + "km/hr" + "  " + "Color is :" + color);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// Object Creation
		Pulser p = new Pulser(45,"Purple");
		p.display();

	}

}
