package com.capgemini.inheritance;
class Bike
{
	protected int speed;
	void display() {
		System.out.println("I Like to drive a bike");
	}
}
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is : " +speed);
	}
}
class Pulser125 extends Pulser
{
	void accept()
	{
		System.out.println("color is :" +color);
		
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		Pulser125 p = new Pulser125();
		p.color= "Black";
		p.speed = 60;
		p.accept();
		p.print();
		p.display();
	

	}

}
