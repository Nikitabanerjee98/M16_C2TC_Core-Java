package com.cg.assig;
import java.util.Scanner;
public class Program2 {
	public static int robot(int m,int n) {
		if(m==1||n==1) {
			return 1;
		}
		else {
			return robot(m-1,n)+robot(m,n-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println(robot(a,b));
		sc.close();
	}

}
