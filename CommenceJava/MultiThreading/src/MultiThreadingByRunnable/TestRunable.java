package MultiThreadingByRunnable;

public class TestRunable {

	public static void main(String[] args) {
		DemoRunnable dr1 = new DemoRunnable();
		DemoRunnable dr2 = new DemoRunnable();
		DemoRunnable dr3 = new DemoRunnable();
		Thread th1 = new Thread(dr1);
		th1.setName("Thread 1");
		Thread th2 = new Thread(dr2);
		th2.setName("Thread 2");
		Thread th3 = new Thread(dr3);
		th3.setName("Thread 3");
		th1.start();
		th2.start();
		th3.start();
	}

}
