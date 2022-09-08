package com.capgemini.clients;

import com.capgemini.BankApp.MMBankFactory;
import com.capgemini.BankApp.MMCurrentAcc;
import com.capgemini.BankApp.MMSavingAcc;
import com.capgemini.Frame.BankFactory;
import com.capgemini.Frame.CurrentAcc;
import com.capgemini.Frame.SavingAcc;

public class Clients {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(632,"Dhanshri katkade",4000, true);
        CurrentAcc c=new MMCurrentAcc(892,"saniya katkade",1000,50);
		System.out.println("Saving Account: ");
		p.withdraw(600);
		
		System.out.println("Current Account: ");
		c.withdraw(500);
		
		
		System.out.println(p);
		System.out.println(c);

	}

}
