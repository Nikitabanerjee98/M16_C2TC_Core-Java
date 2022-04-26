package com.cg.strings;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		System.out.println(str1.toLowerCase());
		System.out.println(50+50+"error"+50+50);
		System.out.println(str1.concat(str2));
		s.close();
	}

}
