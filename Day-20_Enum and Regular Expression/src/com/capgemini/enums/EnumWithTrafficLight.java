package com.capgemini.enums;

enum TrafficLight
{
	RED (30),YELLOW (10),GREEN (30);
	private final int seconds;
//constructor
	private TrafficLight(int seconds) {
		this.seconds = seconds;
	}
//getter method only use bcoz we use constructor to set the value
	public int getSeconds() {
		return seconds;
	}
	
}

public class EnumWithTrafficLight
{
public static void main(String[] args) {
	for(TrafficLight i:TrafficLight.values())	
	{
		System.out.printf("%s:%d seconds\n",i,i.getSeconds());
	}
	}

}
