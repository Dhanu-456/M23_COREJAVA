package com.capgemini.decisionmaking;

public class cascadedifelse {

		public static void main(String[] args) 
		{
			int a = 10 , b = 4 , c = 21;
			if (a>b && a>c)
			{
				System.out.println(a);
				
			}
			else if (b>a && b>c )
			{
				System.out.println(b);
			}
	       
			else
			{
				System.out.println(c);
			}

		}

	}