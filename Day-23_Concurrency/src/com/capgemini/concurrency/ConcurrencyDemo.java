package com.capgemini.concurrency;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class ConcurrencyDemo 
{

public static void main(String[] args) 
	{
		Runnable r=()->
		{
			try
			{
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.println("Current Time: " +LocalTime.now());
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception Handle");
			}
		
		};
		ExecutorService obj =Executors.newFixedThreadPool(10);
		obj.execute(r);
		Future<String> res=obj.submit(r,"Done");
		while(res.isDone())
		{
			try
			{
		    System.out.println("the method returns value: " +res.get());
             break;
			}
			catch(InterruptedException | ExecutionException e)
			{
				e.printStackTrace();
			}
			try
			{
				Thread.sleep(1000L);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		obj.shutdown();
	}
	
}

	
	
