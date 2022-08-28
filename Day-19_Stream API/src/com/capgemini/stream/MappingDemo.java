package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		List<String>obj1=Arrays.asList(new String[] {"DHANSHRI","RUSHIKESH","AVANI","SHRAUU","VIBHU","VIHAN"});
		//
		obj1.stream().map((i->i.length())).forEach((i)->System.out.print(i+ " "));
		//obj1.stream().map((i->i.length()>4)).forEach((i)->System.out.print(i+ " "));

	}

}
