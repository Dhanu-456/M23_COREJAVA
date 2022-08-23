package com.capgemini.collection;

import java.util.Stack;

public class StackExample 
{
	
	@SuppressWarnings("unchecked")
     public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(0,"Dhanshri");
		obj.add(0,'z');
		obj.add(0,12.5f);
	    System.out.println(obj);
		obj.push(45);
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
    }

}
