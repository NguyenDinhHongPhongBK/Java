package MathLibrary;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		int a = Math.max(2, 89);
		System.out.println(a);
		System.out.print("Enter angle : ");
		@SuppressWarnings("resource")
		double r = new Scanner(System.in).nextDouble();
		double radian = r*Math.PI/180;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Sin("+r+") = " + df.format(Math.sin(radian)));
	}

}
