package com.cg.generics;

import java.util.LinkedList;
public class Example2 {

	public static void main(String[] args) {
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("Nikita");
		obj.add("Banerjee");
		String res=obj.get(1);
		System.out.println(res);

	}

}
