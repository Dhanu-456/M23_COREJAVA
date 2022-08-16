package com.capgemini.Interface;
//Multiple inheritance using interfaces
interface Father
{
	void property();
	
}
interface Mother
{
	void Love();
	
}
class Daughter implements Father,Mother
{
	public void Love()
	{
		System.out.println("Mother Loves their Child");
	}
	
	public void Property()
	{
		System.out.println("Father's gives property to Child");
	}

	@Override
	public void property() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.Love();
		d.Property();

	}

}
