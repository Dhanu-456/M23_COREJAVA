package com.capgemini.lamdaexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLamda {

	public static void main(String[] args) 
	{
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
         String str[]= {"Dhanshri" , "Rishi","Abhii" ,"Tejas"};
		 Collections.sort(Arrays.asList(str),obj);	
			for(String i:str)
			{
				System.out.println(i+" ");
			}
		     }

	}


