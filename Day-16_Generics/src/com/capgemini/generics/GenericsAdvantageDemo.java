package com.capgemini.generics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo
{
private static Integer d;

public static void main(String[] args) 
{
	List<Integer>obj=new LinkedList<>();
	obj.add(12);
	
	System.out.println(obj);
	List<Integer>obj2=new ArrayList<>();
	
	obj.get(0);
	obj2.add(15);
 	System.out.println(obj2);
}

}
