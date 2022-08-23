package com.capgemini.collection;
import java.util.LinkedList;

import java.util.List;


public class LinkListExample 
{
@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
	@SuppressWarnings("rawtypes")
	List obj=new LinkedList<>();
	obj.add(11);
	obj.add("Dhanshri");
	obj.add(76.90);
	obj.add(11);
	obj.add(76);
	System.out.println(obj);
	System.out.println(obj.size());
	obj.remove(0);
	System.out.println(obj.lastIndexOf(11));
	System.out.println(obj);
	}




	

	}


