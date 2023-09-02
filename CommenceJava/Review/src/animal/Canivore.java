package animal;

public class Canivore extends Animal {
	String color;
	String test = "Canivore";
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Canivore() {
		super();
		System.out.println("We are canivore");
	}
	
	public Canivore(String name, String aliment) {
		super(name,aliment);
	}
	
	public Canivore(String name, String aliment, String color) {
		super(name,aliment);
		this.color = color;
	}
	
	
	
	@Override
	public void notice() {
		System.out.println("Notice Canivore");
		
	}
	
	public void mention() {
		System.out.println("Mention Carnivore");
	}
}
