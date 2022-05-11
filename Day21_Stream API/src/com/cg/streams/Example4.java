package com.cg.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(23,31,10,27,40,5);
		List<Integer>obj2=obj.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(obj2);
		
	}
	

}
