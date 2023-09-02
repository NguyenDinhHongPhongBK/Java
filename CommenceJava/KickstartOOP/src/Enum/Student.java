package Enum;

public class Student implements Comparable<Student>
{
	private String Name;
	private double Mark;
	private RankedAcademic CapacityAcademic;
	
	public Student() {
		super();
	}
	
	public Student(String name, double mark) {
		super();
		this.Name = name;
		this.Mark = mark;
		this.setCapacityRank();
	}
	
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public double getMark() {
		return this.Mark;
	}
	public void setMark(double mark) {
		this.Mark = mark;
	}
	public RankedAcademic getCapacityAcademic() {
		return this.CapacityAcademic;
	}
	
	public void setCapacityRank() {
		if(this.Mark >= 9.5)
			this.CapacityAcademic = RankedAcademic.Excellent;
		else if(this.Mark >= 8.5)
			this.CapacityAcademic = RankedAcademic.VeryGood;
		else if(this.Mark >= 8)
			this.CapacityAcademic = RankedAcademic.Good;
		else if(this.Mark >= 7)
			this.CapacityAcademic = RankedAcademic.FairlyGood;
		else if(this.Mark >= 6)
			this.CapacityAcademic = RankedAcademic.Average;
		else if(this.Mark >= 5)
			this.CapacityAcademic = RankedAcademic.BelowAverage;
		else if(this.Mark >= 4)
			this.CapacityAcademic = RankedAcademic.Week;
		else {
			this.CapacityAcademic = RankedAcademic.Fail;
		}
	}
	
	public String toString() {
		return this.Name + "\t" + this.Mark +"\t" + this.CapacityAcademic.Decription();
	}

	public int compareTo(Student o) {
		if(this.Mark < o.Mark)
			return 1;
		if(this.Mark > o.Mark)
			return -1;
		return 0;
	}
}






















