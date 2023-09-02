package AbstractInheritance;

public class SeasonalEmployee extends Employee {
	
	public SeasonalEmployee() {
		super();
	}

	public SeasonalEmployee(int id, String name) {
		super(id, name);
	}
	
	public void caculateSalary() {
		System.out.println("Salary of " + this.getName() + "(seasonal employee) : " + 900);
	}
}
