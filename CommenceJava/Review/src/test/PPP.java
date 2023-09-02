package test;

class AA {
	AA(String s) {
		System.out.println(s);
	}

	AA(String s, String t) {
		this(s + t);
	}

	AA() {
		
	}
}

class BB extends AA {
	BB(String s) {
		System.out.println(s);
	}

	BB(String s, String t) {
		this(t + s + "3");
	}

	BB() {
		super("4");
	};
}

public class PPP {

	public static void main(String[] args) {
		BB b = new BB("Test");

	}
}
