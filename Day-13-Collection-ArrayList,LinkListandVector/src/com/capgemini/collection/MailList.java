package com.capgemini.collection;

import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class Address
{
	private int PlotNo;
	private String Street;
	private String Area;
	private String City;
	private String State;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		PlotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [PlotNo=%s, Street=%s, Area=%s, City=%s, State=%s]", PlotNo, Street, Area, City,
				State);
	}
	
	
}
public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//add the elements to linked list
		obj.add(new Address(93,"oney", "niphad", "Nashik", "Maharashtra"));
		obj.add(new Address(25,"panchvati", "ozar", "Nashik", "Maharashtra"));
         java.util.Iterator<Address> i =obj.iterator();
         while(i.hasNext())
         {
        	 Object element=i.next();
        	 System.out.println(element);
         }
	}

}
