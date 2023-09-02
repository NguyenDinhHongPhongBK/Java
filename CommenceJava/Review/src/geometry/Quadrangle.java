package geometry;

public class Quadrangle extends Geometry {
	protected int point;
	public Quadrangle() {
		super();
		System.out.println("Parent Quadrangle()");
	}
	
	public Quadrangle(String name, int point) {
		super(name);
		this.point = point;
	}
	@Override
	public float areas() {
		return 0;
	}
	public int volumn() {
		return 3;
	}
	
	public int perimeter() {
		return 4;
	}
	
	 
}
