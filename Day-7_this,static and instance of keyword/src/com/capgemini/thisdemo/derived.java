package com.capgemini.thisdemo;

public class derived extends base1
{
   derived()
   {
	   System.out.println("Default constructor for Derived");
   }
   derived(int i)
   {
	   
	   this(); 
	   System.out.println("Parameterized constructor for Derive" + i);
   }
}
