package com.capgemini.annotations;
import java.util.ArrayList;
 class SuppressWarningsAnnotation {
	

@SuppressWarnings("unused")
 public static void main(String args[])
{

ArrayList<String> list=new ArrayList<String>();
list.add("Dhanu");
list.add("Chakuli");
list.add("Aarya");

for(Object obj:list)
System.out.println(obj);

}
}


