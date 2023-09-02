package test;

class Over {
	public Over() {
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println();
	}
}

public class Overr extends Over {
	public static int demo() {
		int i = 0;
		try {
			i = 1/3;
			return i;
		} catch (Exception e) {
			i = 2;
			return i;
		}finally {
			i = 3;
		}
	}
	
	int method(int i) {
		return i;
	}
	
	float method(float i) {
		return i;
	}
	
	public static void main(String[] args) {
		double f =(int) 9.8;
		float l =(float) f;
		byte b = (byte) 4;
		System.out.println(demo());
	}
}
