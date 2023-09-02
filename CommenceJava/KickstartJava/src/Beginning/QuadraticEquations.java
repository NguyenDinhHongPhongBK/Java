package Beginning;

import java.util.Scanner;

public class QuadraticEquations {

	public static void SolveEquation(double a, double b, double c) 
	{
		if(a == 0) {
			if(b == 0 && c == 0)
				System.out.println("Equation has infinity solution");
			else if(b == 0 && c!= 0)
				System.out.println("Equation has no solution");
			else {
				System.out.println("Equation has one solution : "+ -c/b);
			}
		}
		else {
			double delta = b*b - 4*a*c;
			if(delta < 0) 
				System.out.println("Equation has no solution");
			else if(delta == 0)
				System.out.println("Equation has double root : " + -b/(2*a));
			else {
				double s1 = (-b - Math.sqrt(delta))/2/a;
				double s2 = (-b + Math.sqrt(delta))/2/a;
				System.out.println("Equation has two solutions :  X1 = "+s1+" ; X2 = "+s2);
			}
		}
	}
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) 
	{
		double a,b,c;
		String cmd;
		Scanner sc = new Scanner(System.in);
		while(true) {
			do {
				System.out.print("Do you want to solve equations (Yes or No) : ");
				cmd = new Scanner(System.in).nextLine();		
				if(!cmd.equals("Yes") && !cmd.equals("No"))
					System.out.println("Please enter Yes or No");
			}while(!cmd.equals("Yes") && !cmd.equals("No"));
			if(cmd.equals("No")) break;
			System.out.print("Enter a : ");
			a = sc.nextDouble();
			System.out.print("Enter b : ");
			b = sc.nextDouble();
			System.out.print("Enter c : ");
			c = sc.nextDouble();
			SolveEquation(a,b,c);
		}
	}
}














































