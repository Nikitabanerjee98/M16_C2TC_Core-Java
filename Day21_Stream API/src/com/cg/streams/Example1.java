package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(23,31,10,27,40,5);
		obj.stream().filter(i->i>30).forEach(i->System.out.println(i));

	}

}
