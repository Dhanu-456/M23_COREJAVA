package com.capgemini.statickeyword;
class A
{
	
}
public class childinstance extends A {

	public static void main(String[] args) {
		childinstance c = new childinstance();
		System.out.println(c instanceof A);
		System.out.println(c instanceof childinstance);
		

	}

}
