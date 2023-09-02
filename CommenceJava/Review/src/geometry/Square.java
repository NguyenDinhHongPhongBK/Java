package geometry;

public class Square extends Quadrangle implements Operation {
	protected String area;
	protected int edge;
	public Square() {
		super();
		System.out.println("Child Square()");
	}
	
	public Square(int e ,String a) {
		super();
		area = a;
		edge = e;
	}
	@Override
	public float areas() {
		return edge * 4;
	}
	
	public int perimeter() {
		return 4;
	}
}
