package com.cg.oops;

public class Constructor {

	String str;
	int a;
	Constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor("Taniya",51);
		Constructor c1=new Constructor("Mou",22);
		c.display();
		c1.display();
	}

}