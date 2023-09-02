package encapsulation;

public class Lecturer {
	private String fullName;
	private int age;
	public Lecturer() {
	};
	public Lecturer(String nameString) {
		this();
		setFullName(nameString);
	}
	public Lecturer(String nameString, int age) {
		this(nameString);
		setAge(age);
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void getInfor(Lecturer a) {
		if(a.getFullName() == null) {
			System.out.println("Please input fullname");
			return;
		}
		else if (a.getAge() == 0) {
			System.out.println("Please input age");
			return;
		}
		System.out.println("Name : "+a.getFullName()+"\n"+"Age : "+a.getAge());
	}
	
	public void increase(Lecturer l) {
		l.setAge(getAge() + 1);
	}
	
	
	public static void main(String[] args) {
		Lecturer lecturer = new Lecturer();
		Lecturer.getInfor(lecturer);
	}
}
