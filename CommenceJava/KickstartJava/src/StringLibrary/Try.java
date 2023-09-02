package StringLibrary;

public class Try {

	public static void main(String[] args) {
		String name = "Nguyen 	Dinh	Hong Phong";
		String[] Arr = name.split("\\s+");
		for(String w : Arr)
			System.out.println(w);

	}

}
