package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		Random rd = new Random();
		System.out.print("Enter number of elements in array : ");
		n = new Scanner(System.in).nextInt();
		int[] A = new int[n];
		for(int i = 0;i < n;i++)
			A[i] = -100 + rd.nextInt(200);
		for(int number : A)
			System.out.print("\t"+number);
		System.out.println();
		//Sort
		Arrays.sort(A);
		for(int number : A)
			System.out.print("\t"+number);
		//Search
		int c = Arrays.binarySearch(A,A[3]);
		System.out.println("\n"+c);



		
	
	}

}














