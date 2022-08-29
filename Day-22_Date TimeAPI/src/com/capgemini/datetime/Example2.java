package com.capgemini.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		String dateString = "2022-09-01 10:30";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);

		System.out.println(parsedDateTime);	

	}

}




