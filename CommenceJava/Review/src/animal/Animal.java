package animal;

public class Animal {
	String name;
	String aliment;
	String test = "Animal";
	
	public Animal() {
		super();
		System.out.println("We are animal");
	}
	
	public Animal(String name, String aliment) {
		super();
		this.name= name;
		this.aliment = aliment;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAliment() {
		return aliment;
	}
	public void setAliment(String aliment) {
		this.aliment = aliment;
	}
	
	
	public void notice() {
		System.out.println("Notice Animal");
	}
	
	public void remark() {
		System.out.println("Remark animal");
	}
	
}
