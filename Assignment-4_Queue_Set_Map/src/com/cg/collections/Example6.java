package com.cg.collections;

import java.util.ArrayDeque;


public class Example6 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(12);
		a.add("Nikita");
		a.addFirst(0.4);
		a.addLast('b');
		System.out.println(a);

	}

}
