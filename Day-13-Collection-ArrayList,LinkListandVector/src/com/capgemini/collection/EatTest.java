package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;

 class Fruit
{
	public String name;
	public Fruit(String name)
	{	
		super();
		this.name = name;
	}
}
public class EatTest {

	public static void main(String[] args) {
		ArrayList<Fruit>obj=new ArrayList<Fruit>();
		Fruit f=new Fruit("Apple");
         obj.add(f);
 		 obj.add(new Fruit("Grapes"));
		 obj.add(new Fruit("Chickoo"));

		Iterator<Fruit>i=obj.iterator();
		while(i.hasNext())
		{
			Fruit f1=i.next();
			System.out.println(f1.name);
			
		}
	}

}
