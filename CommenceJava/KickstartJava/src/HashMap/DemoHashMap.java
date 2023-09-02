package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> Carnivores = new HashMap<Integer, String>();
		
		// put
		Carnivores.put(1, "Tiger");
		Carnivores.put(2, "Lion");
		Carnivores.put(3, "Leopart");
		Carnivores.put(4, "Wolf");
		Carnivores.put(5, "Fox");
		Carnivores.put(6, "Hyena");
		System.out.println(Carnivores);
		String a = Carnivores.get(1);
		System.out.println(a);
		
		// hashmap.values() && hashmap.
		Collection<String> Carn = Carnivores.values();
		System.out.println(Carn);
		Set<Integer> setKey = Carnivores.keySet(); 
		System.out.println(setKey);
		
		// containsKey
		boolean isExist = Carnivores.containsKey(2);
		if(isExist)
			System.out.println(Carnivores.get(2) + " is exist in this hashmap");
	}

}














