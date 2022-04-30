package com.cg.collections;

import java.util.ArrayList;

import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		System.out.println(l.isEmpty());
		l.add("helllo");
		l.add("Nikita");
		l.add('B');
		l.add(13.6);
		l.add(1);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains(15));
		System.out.println(l.indexOf(1));
		System.out.println(l.lastIndexOf(1));
		System.out.println(l.get(2));
		l.set(3, 33);
		System.out.println(l);
		System.out.println(l.isEmpty());
	}

}