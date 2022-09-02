package com.capgemini.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);	
		Pattern p=Pattern.compile("and");
		//Matcher m=p.matcher("java is good language to learn and earn the money and i like it to learn");
        System.out.println("enter the string:");
        
		Matcher m=p.matcher(s.nextLine());
		while(m.find()) 
         {
        	 System.out.println("pattern found from "+m.start()+"to "+(m.end()-1));
         }
         s.close();
	}

}
