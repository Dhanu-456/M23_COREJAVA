package com.capgemini.annotations;
class Animal 
{
   void OverrideAnnotation()
	{
System.out.println("eating something");
}  
}  
 class Dog extends Animal
{  
@Override  
void OverrideAnnotation()
{
System.out.println("eating foods");
}//should be eatSomething  
}  
class Example1
{  
public static void main(String args[])
{  
Animal a=new Dog();
a.OverrideAnnotation();

}
} 


