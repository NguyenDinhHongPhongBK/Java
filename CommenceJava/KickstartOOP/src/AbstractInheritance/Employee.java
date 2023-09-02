package AbstractInheritance;

public abstract class Employee {
	private int Id;
	private String Name;

	public Employee() {}
	
	public Employee(int id, String name) {
		super();
		this.Id = id;
		this.Name = name;
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
	
	public abstract void caculateSalary();
		
}


























