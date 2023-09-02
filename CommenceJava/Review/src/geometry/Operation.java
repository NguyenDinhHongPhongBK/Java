package geometry;

public interface Operation {
	public static final int CON = 10;

	int perimeter();

	default void notice() {
		System.out.println("Hay");
	}
	
	default int calculate() {
		return 4;
	}
	
	public static void think() {
		System.out.println("Think");
	}
}
