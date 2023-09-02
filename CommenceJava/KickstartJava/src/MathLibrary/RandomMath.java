package MathLibrary;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class RandomMath {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a;
		int n;
		System.out.print("Enter number of integer terms : ");
		n = sc.nextInt();
		Random rd = new Random();
		for(int i = 0;i<n;i++) {
			a = -100 + rd.nextInt(200);
			System.out.println(a);
		}
		System.out.print("Enter number of double terms : ");
		n = sc.nextInt();
		double b;
		DecimalFormat df = new DecimalFormat("##.000");
		for(int i = 0;i < n;i++) {
			b = 100 * rd.nextDouble();
			System.out.println(df.format(b));
		}

	}

}
