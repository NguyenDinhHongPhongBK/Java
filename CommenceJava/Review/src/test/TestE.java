package test;

import java.util.ArrayList;

class Ai {
}

class B extends Ai {
}

class C extends B {
}

public class TestE {
	static int a = 10;

	static void increase() {
		a += 1;
	}

	public void check1(int n) throws Exception {
		if (n <= 0)
			throw new Exception("Number should be greater than 0");
	}

	public void check2(int n) throws RuntimeException {
		if (n == 5)
			throw new RuntimeException("Number should not be 5");
	}

	public void check3(int n) throws Exception, RuntimeException {
		check1(n);
		check2(n);
	}

	static void method(Ai a) {
		System.out.println("Method A");

	}

	static void method(C b) {
		System.out.println("Method C");
	}

	static void method(Object obj) {
		System.out.println("Method B");
	}

	public static void main(String[] args) {
		B c = new C();
		method(c);
		int at;

	}

}
