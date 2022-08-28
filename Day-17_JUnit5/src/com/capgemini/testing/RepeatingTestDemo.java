package com.capgemini.testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTestDemo 
{
	@RepeatedTest(5)
	void print()
	{
		
		System.out.println("hey guys whats going on");
	}
}
