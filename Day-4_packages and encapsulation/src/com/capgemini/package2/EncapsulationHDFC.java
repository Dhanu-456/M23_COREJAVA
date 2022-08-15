package com.capgemini.package2;
import com.capgemini.package1.HDFC;

public class EncapsulationHDFC {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setAmount(56000);
		System.out.println("The amount in my bank is : "+h.getAmount());

	}

}
