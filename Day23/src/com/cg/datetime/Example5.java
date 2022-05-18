package com.cg.datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Example5 {
	public static void main(String[] args) {
		String x="2022-04-15 14:44";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(x, df);
		System.out.println(l);
		

	}


}
