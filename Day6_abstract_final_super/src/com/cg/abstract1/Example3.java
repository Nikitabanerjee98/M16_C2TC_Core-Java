package com.cg.abstract1;

class A
{
	String name="Tania";
}
class B extends A
{
	String name="Mou";
	void print()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("Hi, I am "+super.name);
	}
}
public class Example3 
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.print();

	}

}
