package com.cg.collections;

import java.util.ArrayDeque;

public class Example2 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(21);
		a.add("Nikita");
		System.out.println(a);
		a.addFirst(22);
		a.addLast("Banerjee");
		System.out.println(a);

	}

}
