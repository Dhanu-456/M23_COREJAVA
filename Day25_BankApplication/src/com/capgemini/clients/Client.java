package com.capgemini.clients;
import com.capgemini.BankApp.MMBankFactory;
import com.capgemini.BankApp.MMSavingAcc;
import com.capgemini.Frame.BankFactory;
import com.capgemini.Frame.CurrentAcc;
import com.capgemini.Frame.SavingAcc;

public class Client {

	public static void main(String[] args) {
	@SuppressWarnings("unused")
	BankFactory b=new MMBankFactory();
	SavingAcc s=new MMSavingAcc(891,"Dhanshri katkade ", 4000, true);
    CurrentAcc c=new com.capgemini.BankApp.MMCurrentAcc(892,"Komal Gaikwad ", 4000, 2500);
	System.out.println("Saving Account :");
		s.withdraw(600);
		
		System.out.println("Current Account :");
		c.withdraw(600);
		
		
		System.out.println(s);
		System.out.println(c);

	}

}
