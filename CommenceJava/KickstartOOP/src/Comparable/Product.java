package Comparable;

public class Product implements Comparable<Product>
{
	int Id;
	String Name;
	long Price;
	
	public Product() {
		super();
	}
	
	public Product(int id, String name, long price) {
		super();
		Id = id;
		Name = name;
		Price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long price) {
		Price = price;
	}

	@Override
	public String toString() {
		return this.Id + "\t" + this.Name + "\t" + this.Price; 
	}

	@Override
	public int compareTo(Product o) {
		/*if(this.Price < o.Price)
			return -1;
		else if(this.Price > o.Price)
			return 1;
		return 0;*/
		return this.Name.compareToIgnoreCase(o.Name);
	}
	
}





















































































