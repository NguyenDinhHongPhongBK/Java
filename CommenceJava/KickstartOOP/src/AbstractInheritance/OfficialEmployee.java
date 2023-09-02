package AbstractInheritance;

public class OfficialEmployee extends Employee {

	public OfficialEmployee() {
		super();
	}

	public OfficialEmployee(int id, String name) {
		super(id, name);
	}
	
	public void caculateSalary() {
		System.out.println("Salary of " + this.getName() + "(official employee) : " + 1000);
	}
	
}
