package animal;

import java.util.ArrayList;

public class Test {

	public void callNotice(ArrayList<? super Canivore> objects) {
		for (Object a : objects) {
			Animal b = (Animal) a;
			b.notice();
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		Canivore canivore = new Canivore();
		Animal animal = canivore;
		Canivore canivore2 = (Canivore) animal;
		canivore2.mention();
		Tiger tiger = new Tiger();
		ArrayList<Canivore> animals = new ArrayList<>();
		animals.add(tiger);
		//animals.add(animal);
		animals.add(tiger);
		test.callNotice(animals);
		
		System.out.println("_________________");
		Animal animal2 = new Canivore();
		Canivore canivore3 = (Canivore)animal2;
		animal2.notice();
		canivore3.notice();
		System.out.println(animal2.test);
		System.out.println("_________________");
		
		Animal animal3 = new Canivore();
		animal3.notice();
		Canivore canivore4 = (Canivore) animal3;
		System.out.println(canivore4.test);
		
//		Animal animal4 = new Canivore();
//		Tiger tiger2 = (Tiger)animal4; 
		
		

	
	}
}
