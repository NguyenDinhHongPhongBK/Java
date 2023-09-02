package geometry;

public abstract class Geometry implements Operation {
	protected String name;
	public Geometry() {
		super();
	}
	
	public Geometry(String name) {
		super();
		this.name = name;
	}
	public abstract float areas();
	public int volumn() {
		return 1;
	}
	
	public static void test() {
		System.out.println("Test");
	}
	
}
