package MultiThreadingByThread;

public class TestThread {

	public static void main(String[] args) {
		DemoThread  dt1 = new DemoThread();
		dt1.start();
		DemoThread  dt2 = new DemoThread();
		dt2.start();
		DemoThread  dt3 = new DemoThread();
		dt3.start();

	}

}
