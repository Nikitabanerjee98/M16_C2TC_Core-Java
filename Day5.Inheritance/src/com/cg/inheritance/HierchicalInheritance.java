package com.cg.inheritance;

class CellPhones {
	void message() {
		System.out.println("Hi, Nikita");
	}

	void call() {
		System.out.println("I am calling Tanu");
	}
}

class Samsung extends CellPhones {
	void feature() {
		System.out.println("Modern Feature");
	}
}

class OnePlus extends CellPhones {
	void games() {
		System.out.println("PUB-G");
	}
}
public class HierchicalInheritance {

	public static void main(String[] args) {
		OnePlus o = new OnePlus();
		o.games();
		o.message();
		o.call();
		Samsung m = new Samsung();
		m.feature();

	}

}