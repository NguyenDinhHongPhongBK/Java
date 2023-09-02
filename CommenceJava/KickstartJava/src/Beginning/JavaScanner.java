package Beginning;

import java.util.Scanner;

public class JavaScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int a = sc.nextInt();
		System.out.println("Your number is " + a);
		System.out.print("Please enter a double number : ");
		double b = sc.nextDouble();
		System.out.println("Your double number is "+b);
		System.out.print("Please enter a string : ");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Your string is "+str);
	}

}
