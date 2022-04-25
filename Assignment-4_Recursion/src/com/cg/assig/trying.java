package com.cg.assig;


public class trying {
	public static int findWinner(int n, int k) {
        if (n==1)
            return 1;
        else
            return (findWinner(n-1,k) + k - 1) % n + 1;
        
    }
	
 

	public static void main(String[] args) {
	
		int n=2;
		int k=2;
		System.out.println("The out put is :"+findWinner(n,k));
		

	}

}
