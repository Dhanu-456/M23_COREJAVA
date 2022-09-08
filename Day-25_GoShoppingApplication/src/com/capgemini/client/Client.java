package com.capgemini.client;

import com.capgemini.application.GSNormalAcc;
import com.capgemini.application.GSPrimeAcc;
import com.capgemini.application.GSShopFactory;
import com.capgemini.framework.NormalAcc;
import com.capgemini.framework.PrimeAcc;
import com.capgemini.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"DHANSHRI KATKADE " ,1967, true);
		NormalAcc n=new GSNormalAcc(1002,"SANIYA KATKADE " ,500, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(500);
		
		System.out.println("Normal Account: ");
		n.bookProduct(500);
		
		
		System.out.println(p);
		System.out.println(n);
}

}
