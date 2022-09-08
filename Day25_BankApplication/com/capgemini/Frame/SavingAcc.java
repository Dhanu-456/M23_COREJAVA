package com.capgemini.Frame;

public abstract class SavingAcc extends BankAcc 
{  
private boolean isSalaried;
	
 @SuppressWarnings("unused")
 static final private float MINBAL=0.0f;
	
 public SavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
  super(AccNo, accNm, accBal);
  this.isSalaried = isSalaried ;
 }

	
	
 @Override
 public String toString() {
  return String.format("SavingAcc [isSalaried=%s]", isSalaried);
 }

 public void withdraw(float accBal)
 {
  System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()+" "
  +"Balance is: "+this.getaccBal());
 }

   
}
