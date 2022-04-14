package com.cg.oops;

public class Car1 {

	String str;
	Car1(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("This is "+str);
	}

	public static void main(String[] args) 
	{
		Car1 a=new Car1("BMW");
		Car1 c=new Car1("MERCEDES");
		Car1 c1=new Car1("AUDI");
		a.print();
		c.print();
		c1.print();
	}

}
		

	
