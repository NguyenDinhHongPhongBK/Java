package test;

import java.util.Scanner;

public class ManipulateException {
	static int calculate(int no, int no1) throws Exception {
		if (no1 == 0)
			throw new ArithmeticException("Cannot devide by 0!");
		int num = no / no1;
		return num;
	}
	
	static int divide(int no, int no1) throws ArithmeticException {
		if (no1 == 0)
			throw new ArithmeticException("Cannot devide by 0!");
		int num = no / no1;
		return num;
	}

	static void check(int k) throws HandleException {
		if (k < 90) {
			throw new HandleException("K should >= 90");
		}
	}

	static void input(int age, String name) throws Exception {
		if (age < 18) {
			throw new ArithmeticException("Age must be at least 18");
		}

		if (name == "") {
			throw new NullPointerException("Name must not be null");
		}
		System.out.println("Age : " + age);
		System.out.println("Name : " + name);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			int a = 3;
			int b = 0;
			float c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			;
		} finally {
			System.out.println("Finish");
		}
		System.out.println("Phong");

		try {
			System.out.println(calculate(2, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Phong");

		try {
			input(66, "88");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			int k = new Scanner(System.in).nextInt();
			check(k);
		} catch (HandleException e) {
			System.out.println(e.getMessage());
		}
		
		divide(0, 7);
		
		
		int k = new Scanner(System.in).nextInt();
		System.out.println(k);
		
	}
}
