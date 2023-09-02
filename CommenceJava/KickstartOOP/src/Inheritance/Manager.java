package Inheritance;

public class Manager extends Officer
{
	public Manager() {
		super();
	}
	public Manager(int id, String name) {
		super(id,name);
	}
	
	public void setSalary() {
		super.setSalary();
		this.Salary = 5000;
		System.out.println(this.Salary);
	}
}
