package com.capgemini.superdemo;

public class base2 extends base1
{
  base2()
  {
	  super();
	  System.out.println( "Default Constructor for Base2");
  }
  base2 (int i)
  {
	  super(i);
	  System.out.println( "Parameterized Constructor for Base2 :"+ " " + i);

  }
}
