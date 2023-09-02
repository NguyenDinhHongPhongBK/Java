package AliasAndAutomaticCollectRubbishMechanism;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		DemoAlias fraction1 = new DemoAlias(3,4);
		DemoAlias fraction2 = new DemoAlias(6,8);
		fraction1 = fraction2;
		fraction1.Show();
		fraction2.denominator = 19;
		fraction1.Show();
		DemoAlias fraction3 = new DemoAlias();
		fraction3 = fraction2.copy();
		fraction3.Show();
		fraction2.numerator = 67;
		fraction3.Show();
		
	}

}
