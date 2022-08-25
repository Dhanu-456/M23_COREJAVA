package com.capgemini.generics;

public class Executor {

	public static void main(String[] args) {
	Sender<String>obj=new Sender<>();
	obj.setMessage("Generic class demo");
	obj.sendMessage();
// create an email obj to be send using sender
	Email em=new Email();
	em.setFrom("dhanshrikatkade@gmail.com");
	em.setTo("saniyakatkade@gmail.com");
	em.setSubject("java full stack");
	em.setBody("about training and placement");
	
	
	Sender<Email>obj1=new Sender<>();
	obj1.setMessage(em);
	obj1.sendMessage();


	}

}
