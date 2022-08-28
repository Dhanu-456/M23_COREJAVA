package com.capgemini.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

public interface TestLifeCycleLogger
{
	@Test
     default void testMethod()
	
	{
		System.out.println("Test Method");
	}
    @BeforeAll
		default void  BeforeAlltests()
		
		{
			System.out.println("Before all test");
		}
	}


