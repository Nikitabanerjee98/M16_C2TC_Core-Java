package com.cg.junit5;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class jUnit4 {

	@BeforeAll
	static void display()
	{
		System.out.println("Mou");
	}
	
	@Test
	void display1()
	{
		System.out.println("Priya");
	}
}
