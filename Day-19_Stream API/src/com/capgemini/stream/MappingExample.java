package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {22,4,9,5,3});
		//obj1.stream().map(i->i*i).forEach((i)->System.out.print(i+ " "));
		
		//stream class-collectors just like collections class//[]
		List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(obj2+" ");

	}

}





