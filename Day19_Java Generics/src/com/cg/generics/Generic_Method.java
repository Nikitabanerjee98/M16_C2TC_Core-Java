package com.cg.generics;

public class Generic_Method {

	public static <E>void display(E[] arr)
	{
		for(E itr:arr)
		{
			System.out.println(itr);
		}
		System.out.println();
		
	}

	public static void main(String[] args)
	{
		Integer[] x= {1,2,3};
		Character[] y={'A','B'};
		display(x);
		display(y);
		
		

	}

}
