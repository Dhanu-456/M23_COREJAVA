package com.capgemini.statickeyword;

public class staticbox {
	double width;
	double height;
	static int count;
	//Parameterized constructor
	public staticbox(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
     public staticbox()
     {
    	 super();
    	 int cnt =0;
    	 cnt++;
    	 System.out.println("Count is : " +cnt);
    	 count++;
    	 System.out.println("Count is : " +cnt);

    	 
     }
	public static void main(String[] args) {
		staticbox s = new staticbox();
		System.out.println(s.width);
		

	}

}
