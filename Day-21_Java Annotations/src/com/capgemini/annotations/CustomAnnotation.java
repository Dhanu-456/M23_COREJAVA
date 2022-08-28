package com.capgemini.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface custom
{
	//multi value annotation
	String print() default"Dhanu";
	int speed() default 5;
	float percentage()default 87.8f;
	
}	
 class B 
{
	@custom (print="Hello Student",speed=50,percentage=(float) 87.80)
	public void display()
	{
		System.out.println("Hurrah! It's Holiday");
	}
}
public class CustomAnnotation {
	
   public static void main(String[] args) throws NoSuchMethodException, SecurityException
   {
		B b=new B();
		b.display();
        Method m=b.getClass().getMethod("display");
        custom obj=m.getAnnotation(custom.class);
        System.out.println(obj.print());
        System.out.println(obj.speed());
        System.out.println(obj.percentage());


	}

}
