package communityuni.com.model;

public class Triangle
{
	private double EdgeA;
	private double EdgeB;
	private double EdgeC;
	
	public Triangle() {};
	public Triangle(double a, double b, double c) {
		this.EdgeA = a;
		this.EdgeB = b;
		this.EdgeC = c;
	}
	public void setEdgeA(double a) {
		this.EdgeA = a;
	}
	public void setEdgeB(double b) {
		this.EdgeB = b;
	}
	public void setEdgeC(double c) {
		this.EdgeC = c;
	}
	public double getEdgeA() {
		return this.EdgeA;
	}
	public double getEdgeB() {
		return this.EdgeB;
	}
	public double getEdgeC() {
		return this.EdgeC;
	}
	
	public double CaculatePerimeter() {
		return this.EdgeA + this.EdgeB + this.EdgeC;
	}
	public double CaculateArea() {
		double p = (this.EdgeA + this.EdgeB + this.EdgeC)/2;
		return Math.sqrt(p*(p - this.EdgeA)*(p - this.EdgeB)*(p - this.EdgeC));
	}
}

