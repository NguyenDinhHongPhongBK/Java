package Beginning;

import java.util.Scanner;

public class ConditionBranch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a;
		do {
			System.out.print("Enter year : ");
			a = new Scanner(System.in).nextInt();
			if(a == 0)
				break;
			if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
				System.out.println(a + " is bissextile");
			else
				System.out.println(a + " is not bissextile");
		}while(a != 0);
	}

}
