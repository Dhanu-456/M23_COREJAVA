package com.capgemini.QueueOperations;


import java.util.NavigableMap;
import java.util.TreeMap;

public class Example5 
{

		public static void main(String[] args) {
			NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
	        s.put(45,"Dhanu");
	        s.put(16,null);
	         System.out.println(s);
	         System.out.println(s.lastEntry());

	 }


		}




