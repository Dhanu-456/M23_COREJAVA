package com.capgemini.BankApp;

import com.capgemini.Frame.SavingAcc;

public class MMSavingAcc extends SavingAcc
{


	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
		}

		@Override
		public String toString() {
			return String.format("MMSavingAcc [toString()=%s]", super.toString());
		}
}

