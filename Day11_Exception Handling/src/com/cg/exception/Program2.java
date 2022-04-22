package com.cg.exception;

public class Program2 {

	public static void main(String[] args) {
	System.out.println("First line");
	System.out.println("Second line");
	int[] mylntArray = new int[]{1,2,3};
	try
	{
		print(mylntArray);
		System.out.println("Thired line");
	}
	catch(Exception e)
	{
		System.out.println("Exception handled" +e);	
	}

	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed");
		
		
	}
	

}
