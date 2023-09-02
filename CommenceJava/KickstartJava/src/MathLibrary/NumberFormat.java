package MathLibrary;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormat {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter your Math score : ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.print("Enter your Physic score : ");
		double b = sc.nextDouble();
		System.out.print("Enter your English score : ");
		double c = sc.nextDouble();
		double aver = (a+b+c)/3;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Your average score is  "+df.format(aver));
		int x = 1234567891;
		DecimalFormatSymbols inte = new DecimalFormatSymbols(Locale.getDefault());
		inte.setGroupingSeparator('.');
		df.setDecimalFormatSymbols(inte);
		System.out.println("x = "+df.format(x));
	}

}


























