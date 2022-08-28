package com.capgemini.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		//stream can be created with static data
		Stream<String>obj=Stream.of("Komal","Dhanshri","Rishi","Tina");
		//terminal operation
		obj.forEach((i)->System.out.println(i));
		
		//stream can be acquiring from array or collection
		List<String>obj1=Arrays.asList(new String[] {"1","45","06","99"});
		obj=obj1.stream();
		obj.forEach(System.out::println);
	}

}

