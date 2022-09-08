package com.capgemini.BankApp;

import com.capgemini.Frame.CurrentAcc;

public  class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s]",super.toString());
	}

		
	}
   

