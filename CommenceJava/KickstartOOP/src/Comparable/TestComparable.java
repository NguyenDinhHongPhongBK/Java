package Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class TestComparable {

	public static void main(String[] args) {
		LinkedList<Product> products = new LinkedList<Product>();
		products.add(new Product(1,"Cocacola",20));
		products.add(new Product(2,"Biscuit",10));
		products.add(new Product(3,"Sweet",30));
		products.add(new Product(4,"Ice-cream",40));
		for(int i = 0;i < products.size();i++) {
			System.out.println(products.get(i)); 
		}
		Collections.sort(products);
		System.out.println("Products list after sort : ");
		for(Product product : products) {
			System.out.println(product);
		}
	}

}
