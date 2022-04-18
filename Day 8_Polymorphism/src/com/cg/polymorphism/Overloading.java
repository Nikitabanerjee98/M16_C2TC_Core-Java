package com.cg.polymorphism;
public class Overloading 
{

void assign(float a,float b)
{
	System.out.println("Area of Rectangle: "+(float)(a*b) );
}
void assign(int a,int b)
{
	System.out.println("Area of Rectangle: "+(a*b) );
}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.assign(9f,12f);
	o.assign(20, 40);

}

}

