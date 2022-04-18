package com.cg.polymorphism;
 class shape 
{
	 void print(int a,int b) 
	 {
		 System.out.println(a*b);
	}
	 void print(float a,float b)
	 {
		 System.out.println(a*b); 
	 }
	 void print(int l,int b,int h) {
		 System.out.println(l*b*h);
	 }
}
 
  public class Example{

	public static void main(String[] args) {
       shape s=new shape();
       s.print(15, 23);
       s.print(6.2f, 19.4f);
       s.print(13,25,34);
       
	

	}

}
