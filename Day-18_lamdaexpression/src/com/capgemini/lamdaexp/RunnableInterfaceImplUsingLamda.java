package com.capgemini.lamdaexp;

public class RunnableInterfaceImplUsingLamda {

	public static void main(String[] args)
	{
		Runnable R1=new Runnable()
		{
			public void run() 
			{
				System.out.println("Runnable interface implimentation");
			}
		};
		Thread t=new Thread(R1);
		t.start();

	}

}
