package test;


public class InnerClass {
	private int outer = 100;

	public static class Skinside {
		public Skinside() {
			System.out.println("Demo static");
		}
	}

	void test() {
		for (int i = 0; i < 10; i++) {
			class Inner {
				void display() {
					System.out.println("display: outer_x = " + outer);
				}
			}
			outer += 100;
			Inner inner = new Inner();
			inner.display();
		}
	}
	
	

	public static void main(String[] args) {
		InnerClass i = new InnerClass();
		i.test();
		Skinside skinside = new Skinside();
		InnerClass.Skinside skinside2 = new InnerClass.Skinside();

	}
}
