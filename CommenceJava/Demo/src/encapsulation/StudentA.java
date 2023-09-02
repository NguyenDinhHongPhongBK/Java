package encapsulation;

public class StudentA {
	private String name;
	private int age;
//	private float caculus1;
//	private float caculus2; 
//	private float caculus3;
	
	public StudentA(){};
	
	public StudentA(String name){
		this();
		setName(name);
	}
	public StudentA(String name, int age){
		this(name); 
		setAge(age);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void PrintProfile(StudentA s) {
		System.out.println("Name : "+s.name +'\n' +"Age : "+s.age);
	}
	public static void main(String[] args) {
		StudentA st1 = new StudentA("Phong",20);
		StudentA.PrintProfile(st1);
	}
}





















