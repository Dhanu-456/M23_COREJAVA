package com.capgemini.statickeyword;

public class staticblock {
	static int num;
	static String str;
	/* StaticBlock(int num, String str)
	 * 
	 */
	//static block if you want to initialize the value without using constructor then use static block
	static
	{
		num = 5;
		str = "Hello";
	}

	public static void main(String[] args) {
		/*StaticBlock s = new StaticBlock();
		  System.out.println(n.num);
		  System.out.println(s.num);*/
		System.out.println(num);
		System.out.println(str);
		
		

	}

}
