package SerializeFile;

import java.util.LinkedList;

public class TestSerialize {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		LinkedList<Customer> customers = new LinkedList<Customer>();
//		customers.add(new Customer(1, "Alexander"));
//		customers.add(new Customer(2, "Shevchenko"));
//		customers.add(new Customer(3, "Robinson"));
//		customers.add(new Customer(4, "Patrick"));
//		customers.add(new Customer(5, "John"));
//		customers.add(new Customer(6, "Quyên"));
//
//
//		
//		boolean r = SerializeFileFactory.SaveFile(customers, "E:/serializeData.txt");
//		if(r)
//			System.out.println("Save successfully");
//		else {
//			System.err.println("Save fail");
//		}
		
		LinkedList<Customer> customers = new LinkedList<Customer>();
		Object data = SerializeFileFactory.ReadFile("E:/serializeData.txt");
		customers = (LinkedList<Customer>) data;
		for(Customer c : customers) {
			System.out.println("\t" + c.getId() +"\t" + c.getName());
		}
	}
}
