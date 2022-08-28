package com.capgemini.annotations;
import java.lang.reflect.Method;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OwnCustom
{
	int accept();
}
class c
{
	@OwnCustom(accept=35)
	public void display()
	{
		System.out.println("Hey,i am using custom annotations");
	}
}
public class CustAnnotation 
{
  public static <C> void main(String[] args) throws NoSuchMethodException, SecurityException {
	c c=new c();
	Method m=c.getClass().getMethod("display");
    OwnCustom obj=m.getAnnotation(OwnCustom.class);
     System.out.println(obj.accept());
	}
  

}
