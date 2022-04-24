package com.cg.assig;

import java.util.Scanner;
public class Program1 {
       static int skip(int n,int m) {
		if(n==1) {
			return 1;
		}
		else {
		return (skip(n-1,m)+m-1)%n+1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int a=skip(n,m);
		System.out.println(a);
        sc.close();
	}
	}


