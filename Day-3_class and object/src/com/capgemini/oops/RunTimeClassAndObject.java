package com.capgemini.oops;

import java.util.Scanner;

// Program on how to create class and object

class Vehicle {
	
	 int x ;
	 // method
	 void display()
	 {
	   System.out.println("Welcome to M23 Batch");
	  
	 }
}

public class RunTimeClassAndObject {

	public static void main(String[] args) {
		System.out.println("Enter the value of x:");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
	    
		 Vehicle yz = new Vehicle();
		 yz.display();
		 System.out.println(yz.x);
		 s.close();
		 
			
		

	}

}
