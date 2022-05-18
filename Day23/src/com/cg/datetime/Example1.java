package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuppressWarnings("unused")

public class Example1 {

	public static void main(String[] args) {
		LocalDateTime obj1=LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2022, 2, 16);
		
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		

	}

}
