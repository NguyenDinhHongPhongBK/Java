package test;

interface Interface3 {
	default void doSomething() {
		System.out.println("Execute in Interface3");
	}

	public static void test() {
		System.out.println("Test");
	}
}

abstract class Parent {
	public void doSomething() {
		System.out.println("Execute in Parent");
	}
}

public class Multiple extends Parent implements Interface3 {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.doSomething();
	}
}
