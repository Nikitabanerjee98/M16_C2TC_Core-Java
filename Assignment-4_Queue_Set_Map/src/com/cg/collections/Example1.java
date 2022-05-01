package com.cg.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(20);
		q.add(22);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());

	}

}