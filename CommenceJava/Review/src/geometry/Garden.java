package geometry;

public class Garden implements Operation {

	@Override
	public int calculate() {
		return 2;
	}
	
	public int perimeter() {
		return Operation.super.calculate() * 4 + Operation.CON;
	}
	
	public void notice() {
		System.out.println("PPP");
	}
	
	public static void main(String[] args) {
		Garden garden = new Garden();
		System.out.println(garden.perimeter());
		garden.notice();

	}
}
