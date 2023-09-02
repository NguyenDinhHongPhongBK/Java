package test;

interface P {
	String p = "PPPP";

	String methodP();
}

interface Q extends P {
	String q = "QQQQ";

	String methodQ();
}

class R implements P, Q {
	public String methodP() {
		return q + p;
	}

	public String methodQ() {
		return p + q;
	}
}


public class A   {
	public static void main(String[] args) {
		R r = new R();
		System.out.print(r.methodP());
		System.out.print(r.methodQ());
	}
}
