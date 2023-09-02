package furniture.normal;

import java.util.Iterator;

import javax.swing.text.ChangedCharSetException;

public class Sofa extends Furniture {
	int id;
	private String fuction;
	private String color;
	private double price;
	private int warranty;
	
	public Sofa() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("QQQQQ");
	}
	
	
	public static void main(String[] args) {
		Furniture furniture = new Furniture() {
		};
		
		furniture.setName("KKK");
		System.out.println(furniture.getName());
		Fuctionality fuctionality = new Fuctionality() {
		};
		fuctionality.print();
		int a = 'g' + 'k';
	}

	
}
