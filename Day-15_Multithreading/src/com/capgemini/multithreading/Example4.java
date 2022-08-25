package com.capgemini.multithreading;

class Thread5 extends Thread
{
	public void run()
	{
      System.out.println("Thread Interruption");
     }
}
public class Example4
{
	public static void main(String[] args)
	{
		Thread5 t1=new Thread5();
		t1.start();
		System.out.println("is thread Interrupted "+t1.isInterrupted());
		t1.interrupt();
		System.out.println("is thread Interrupted " + t1.isInterrupted());

		
		
	}
}