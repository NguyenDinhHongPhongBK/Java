package AliasAndAutomaticCollectRubbishMechanism;

public class DemoAlias implements Cloneable
{
	public int numerator;
	public int denominator;
	public DemoAlias(int n, int d) {
		this.denominator = d;
		this.numerator = n;
	}
	
	public DemoAlias() {};
	public DemoAlias copy() throws CloneNotSupportedException 
	{
		return (DemoAlias) this.clone();
	}

	public void Show() {
		System.out.println(this.numerator + "/" + this.denominator);
	}
}
