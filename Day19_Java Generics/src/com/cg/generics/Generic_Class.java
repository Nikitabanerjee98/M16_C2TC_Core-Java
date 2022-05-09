package com.cg.generics;

public class Generic_Class <T> {

	T val;
	
	void print()
	{
		System.out.println(val.getClass());
		
		
	}
	

	public static void main(String[] args) 
	{
		Generic_Class<Integer> obj=new Generic_Class<>();
		Generic_Class<String> obj1=new Generic_Class<>();
		obj.val=46;
		obj1.val="Priya";
		obj.print();
		obj1.print();
		
		

	}

}
