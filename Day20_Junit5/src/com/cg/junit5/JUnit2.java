package com.cg.junit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnit2 {

	@Test
	void accept()
	{
		
		System.setProperty("1", "NB");
		Assumptions.assumeTrue("NB".equals(System.getProperty("2")));
	}

}


