package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OtherArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> Snakes = new ArrayList<String>();
		Snakes.add("Ophiophagus hannah");
		Snakes.add("Dendroaspis polylepis");
		Snakes.add("Oxyuranus microlepidotus");
		Snakes.add("Agkistrodon piscivorus");
		Snakes.add("Dendroaspis angusticeps");
		System.out.println(Snakes);
		
		
		
		// sort
		Collections.sort(Snakes);
		System.out.println(Snakes);
	
		// removeAll
		ArrayList<String> subSnakes = new ArrayList<String>();
		subSnakes.add("Ophiophagus hannah");
		subSnakes.add("Dendroaspis polylepis");
		Snakes.removeAll(subSnakes);
		System.out.println(Snakes);
		
	}
}

;









































