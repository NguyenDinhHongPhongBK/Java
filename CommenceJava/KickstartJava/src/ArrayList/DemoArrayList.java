package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// Add
		numbers.add(rd.nextInt(100));
		numbers.add(rd.nextInt(200));
		numbers.add(rd.nextInt(200));
		numbers.add(rd.nextInt(200));
		System.out.println(numbers);
		numbers.add(1, 1000);
		System.out.println(numbers);
		
		// get,set
		numbers.set(0,34);
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		
		// Remove
		numbers.remove(0);
		System.out.println(numbers);
		
		
		
		
	}
}































