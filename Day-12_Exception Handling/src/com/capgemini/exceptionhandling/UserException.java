package com.capgemini.exceptionhandling;

 class CustomException extends Exception
 {
 	private int detail;
 	// parameterized constructor

 	public CustomException() {
 		super();
 		this.detail = detail;
 	}

 	public CustomException(String message) {
 		super(message);
 		
 	}

 	@Override
 	public String toString() {
 		return "CustomException [detail=" + detail + "]";
 	}
 	
 }

 public class UserException {
 	
 	void accept(int a)throws CustomException
 	{
 		System.out.println("called compute");
 		if(a>10)
 			throw new CustomException();
 		System.out.println("No Exception");
 	
 	}

 	public void main(String[] args) {
 		try
 		{
 			accept(11);
 		}
 		catch(CustomException e)
 		{
 			System.out.println("Dhanu" + e);
 		}

 	}

 }
