package com.cg.exception;

public class Program3 {

	public static void main(String[] args) {
		System.out.println(Program3.myMethod());

	}
	public static int myMethod() {
		try {
			int x=63;
			int y=9;
			int z=x/y;
			System.out.println("Inside try block");
			System.exit(0);
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
		finally {
			System.out.println("java finally block");
			return 0;
		}
	}

}
