package com.capgemini.enums;
import java.util.Scanner;
enum Movie
{
    //enum constants
	KGF2,BRAMHASTRA,PUSHPA,MAJOR;
	}
public class EnumWithSwitchCase
{
 Movie movie;
 public EnumWithSwitchCase(Movie movie)
 {
 this.movie=movie;
}
public void dsplay()
{
	switch(movie)
	{
	case KGF2:
		System.out.println("yash and shrinidi");
		break;
	case BRAMHASTRA:
		System.out.println("Ranbir kapoor and alia bhat");
		break;
	case PUSHPA:
		System.out.println("Allu arjun and rashmika");
		break;
	case MAJOR:
		System.out.println("Adivi and saie");
		break;
		default:
			System.out.println("Invalid movie name");
	}
}
 
public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("ENTER THE MOVIE NAME THAT U WANT TO DISPLAY:");
     String str=s.nextLine();
     EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
	 obj.dsplay();
 }
}
