package geometry;

interface Counter {
	int next();
}

public class AnonymousInnerClasses {
	private int count = 0;

	Counter getCounter(final String name) {
		return new Counter() {
			{
				System.out.println("Constructor Counter()");
			}

			public int next() {
				System.out.print(name); // Access local final
				System.out.println(count);
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		AnonymousInnerClasses out = new AnonymousInnerClasses();
		Counter c1 = out.getCounter("Local inner ");
		c1.next();
		c1.next();
	}
}









