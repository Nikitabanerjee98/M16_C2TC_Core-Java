package com.cg.strings;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		//String str="Nikita Banerjee";
		//System.out.println(str);
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		
		System.out.println(str1 == str2);
		s.close();

	}

}
