package com.capgemini.testing;

import org.junit.jupiter.api.Test;

public  class HelloWorld implements TestLifeCycleLogger
{
	@Test
	void print()
	{
		System.out.print("hello world");
	}
}


	 

