package com.cg.inheritance;

class bike {
	void print() {
		System.out.println("I like Travalling");
	}

	void print1() {
		System.out.println("I like bike ride ");
	}
}

class exploring extends bike {
	void display() {
		System.out.println("I like Exploring new thing");
	}
}

class Food extends exploring {
	void assign() {
		System.out.println("I like Food");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Food r = new Food();
		r.display();
		r.assign();
		r.print();
		r.print1();

	}

}
