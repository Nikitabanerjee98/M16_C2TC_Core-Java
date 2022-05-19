package com.cg.lambdaexp;
interface A
{
	void show();//Functional interface which contains only one abstract method
	
}

public class Example1 {

	public static void main(String[] args) {
		//Lambda Expression with No Parameter
				A obj=()->
				{
					System.out.println("Functional Interface");
				};
				
				obj.show();

			
	

	}

}
