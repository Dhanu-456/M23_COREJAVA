package com.capgemini.annotations;

class A
{  
void m()
{
System.out.println("hello m");

}  
@Deprecated  
void n()
{
System.out.println("Welcome to my home");
}  
} 
class DeprecatedAnnotation 
{  
public static void main(String args[]){  
  
A a=new A();  
a.n();  
}
} 

