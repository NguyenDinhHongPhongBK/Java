package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingArrayList {

	public static void main(String[] args) {
		ArrayList<String> Toads = new ArrayList<String>();
		Toads.add("Bombina maxima");
		Toads.add("Barbourula kalimantanensis");
		Toads.add("Occidozyga lima");
		Toads.add("Bombina variegata");
		Toads.add("Paa yunnanensis");
		
		// Way 1
		System.out.println("Traversing list through for loop : \t");
		for(int i = 0;i < Toads.size();i++)
			System.out.print("\t" + Toads.get(i));
		
		// Way 2
		System.out.println("\nTraversing list through forEach() method : \t");
		Toads.forEach(a->{
			System.out.print("\t" + a);
		});
		
		// Way 3
		System.out.println("\nTraversing list through forEachRemaining() method : \t");
		Iterator<String> toadIterator = Toads.iterator();
		toadIterator.forEachRemaining(a->{
			System.out.print("\t" + a);
		});
		
		// Way 4
		System.out.println("\nTraversing list through list Iterator \t");
		ListIterator<String> li = Toads.listIterator(Toads.size());
		while(li.hasPrevious()) {
			String w = li.previous();
			System.out.print("\t" + w);
		}
		
	}

}
















