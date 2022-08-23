package com.capgemini.exceptionhandling;

 class NullPointerException {

	

	public static void main(String[] args) {
		String ptr = null;
		try
		{
			if(ptr.equals("dhanu"))
				System.out.println("same");
			else
				System.out.println(" Not same");
		}
		catch(Exception e)
		{
			System.out.println("NullPointerExceptionCaught");
		}

	}
}
