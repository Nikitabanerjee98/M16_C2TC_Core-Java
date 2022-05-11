package com.cg.streams;
import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(23,31,10,27,40,5);
		obj.stream().distinct().forEach(System.out::println);
		System.out.println("Distinct Output: ");
		obj.stream().limit(5).forEach(System.out::println);
		System.out.println("Skip Output: ");
		obj.stream().skip(1).forEach(System.out::println);
		System.out.println("Sorting Output: ");
		obj.stream().sorted().forEach(System.out::println);


	}

}
