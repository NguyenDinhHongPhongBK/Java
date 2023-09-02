package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ColectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> Bears = new LinkedList<String>();
		// add addFirst addLast
		Bears.add("Ursus maritimus");
		Bears.addFirst("Ursus arctos");
		Bears.addLast("Ailuropoda melanoleuca");
		Bears.add(1, "Helarctos malayanus");
		System.out.println(Bears);
			
		// get set getFirst getLast
		Bears.set(0, "Ursus arctos middendorffi");
		System.out.println("Element 1 : "+Bears.get(0)); 
		
		// addAll
		ArrayList<String> Arr = new ArrayList<String>();
		Arr.add("Ailurus fulgens");
		Arr.add("Phascolarctos cinereus");
		Bears.addAll(2,Arr);
		System.out.println(Bears);
		
		// contains
		boolean a = Bears.contains("Ailurus fulgens");
		System.out.println(a);
		
		// Offer : add the specified element as the last element of a list.
		Bears.offer("Ursus thibetanus");
		System.out.println(Bears);
		
		//peek : It retrieves the first element of a list
		System.out.println(Bears.peek());
		
		// poll : It retrieves and removes the first element of a list.
		String p = Bears.poll();
		System.out.println(p);
		System.out.println(Bears);
		
		// remove
		Bears.remove();
		System.out.println(Bears);
		Bears.remove(3);
		System.out.println(Bears);
	}

}













