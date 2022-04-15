package com.cg.abstract1;

class Example
{
	final void display()
	{
		System.out.println("Hello");
	}
}
public class Example2 extends Example
{
	
	
	void eat()
	{
		
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) 
	{
		Example2 e=new Example2();
		e.display();

	}

}
