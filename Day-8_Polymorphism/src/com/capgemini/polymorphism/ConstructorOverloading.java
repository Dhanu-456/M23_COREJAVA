package com.capgemini.polymorphism;
//Program on constructor overloading
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	Triber(int speed, String engine)
	{
		this.speed = speed;
		this.engine = engine;
		System.out.println("speed is :" + speed + " and the engine is on :" + engine);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
          @SuppressWarnings("unused")
		Triber t = new Triber();
          @SuppressWarnings("unused")
		Triber t1 = new Triber(45, "Disel");
	}

}
