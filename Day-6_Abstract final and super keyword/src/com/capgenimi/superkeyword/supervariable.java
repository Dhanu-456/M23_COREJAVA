package com.capgenimi.superkeyword;
class Color
{
	protected String name = "Yellow";
    
}
class Red extends Color
{
	public String name = "Red";
	 void display()
	{
        System.out.println(name);
        //super keyword is used to refer the parent class variable
        System.out.println(super.name);
	}
}
public class supervariable {

	public static void main(String[] args) {
		Red r = new Red ();
		r.display();
        
	}

}
