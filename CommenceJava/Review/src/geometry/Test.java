package geometry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		Square square = new Square(2,"ee");
		System.out.println(square.areas());
		Quadrangle quadrangle = new Quadrangle();
		square.notice();
		System.out.println(square.perimeter());
		Square.test();

		ArrayList<String> listLanguages = new ArrayList<>();
		 
        // them phan tu vao array list
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add(".NET");
        listLanguages.add("C");
        listLanguages.add("C++");
 
        // su dung iterator de hien thi noi dung cua listLanguages
        System.out.println("Danh sach ngon ngu lap trinh: ");
        Iterator<String> itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        
        ListIterator<String> litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + " (PASS)");
        }
        System.out.println("Changed content of listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println("\t"+element);
        }
        System.out.println();
	}
}
