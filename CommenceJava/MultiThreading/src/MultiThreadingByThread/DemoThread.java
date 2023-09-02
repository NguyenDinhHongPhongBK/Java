package MultiThreadingByThread;

public class DemoThread extends Thread
{
	@Override
	public void run() {
		super.run();
		try {
			for(int i = 0;i < 10;i ++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " : i = "+ i );
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
