package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;

import javax.swing.DefaultBoundedRangeModel;

interface X {
	public void methodX();
}

interface Y extends X {
	public void methodY();
}

abstract class Z implements Y{
	
}

class A1{
	A1(){
		System.out.println("A1");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("B1");
	}
}

public class Test {
	
	private int value;
	public static int kkk = 9;
	
	public Test() {
		super();
	}
	public Test(int a) {
		super();
		this.value = a;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int a) {
		this.value = a;
	}
	
	public static void increase(int A[]) {
		A[0] ++;
	}
	
	public void demo() {
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) {
		Test t = new Test();
//		System.out.println(t.value);
//		System.out.println(a);
//		switch(a) {
//		case 1:
//			System.err.println("a = "+1);
//		case 2:
//			System.err.println("a = "+2);
//		case 3:
//			System.err.println("a = "+3);break;
//		default:
//			System.err.println("a = ?");
//		}
		
//		float[] K = new float[2];
//		int A[] = {1,2,3};
		int[] A = {1,2,3};
		increase(A);
		for(int i = 0; i< A.length;i++) {
			System.out.println(A[i]);
		}
		System.out.println("-------------------");
		float[][] B = {{1,2},{3,4}};
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<2;j++) {
				System.out.println(B[i][j]);
			}
		}
		System.out.println("_____________");
		char x = 'y';
		char y = 'k';
		int z = 2;
		double h = 3.5555;
		
		B1 b = new B1();
	}
}









