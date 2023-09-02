package Inheritance;

public class Officer {
	protected int Id;
	protected String Name;
	protected long Salary;
	
	public Officer() {};
	public Officer(int id, String name) {
		this.Id = id;
		this.Name = name;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public int getId() {
		return this.Id;
	}
	public String getName() {
		return this.Name;
	}
	public long getSalary() {
		return this.Salary;
	}
	
	public void setSalary() {
		System.out.print("Salary of "+ this.Name + " : ");
	}
}












