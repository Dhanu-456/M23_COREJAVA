package com.capgemini.Frame;

public abstract class CurrentAcc extends BankAcc
{
    private final float creditLimit;
    
	public CurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}

	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()+" "
		+"Balance is: "+(accBal+creditLimit));
	}
}
