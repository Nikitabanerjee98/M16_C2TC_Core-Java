package com.cg.inheritance;

class Parent {
	void print() {
		System.out.println("Hii,This is Nikita");
	}
}

class Child extends Parent {
	void display() {
		System.out.println(" Welcome to Single Inheritance");
	}
}

class SingleInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.print();

	}

}