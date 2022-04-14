package com.cg.oops;

public class Constructor1 {

	String s;
	Constructor1(String str)
	{
		s=str;
	}
	void display1()
	{
		System.out.println("This is "+s);
	}

	public static void main(String[] args)
	{
		Constructor1 c=new Constructor1("Priya");
		c.display1();
		
		

	}

}
