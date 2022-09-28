package com.capgemini.testing;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodDemo
{
	@Test 
	void display()
	{
		System.out.print(" not disable ");

	}
	

     @Disabled
     @Test
     void accept()
     {
 		System.out.print(" disable ");

     }
}
