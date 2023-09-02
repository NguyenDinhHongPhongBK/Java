package MultiThreadingByRunnable;

public class DemoRunnable implements Runnable 
{

	public void run() {
		try {
			for(int i = 1;i <= 10;i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + ": i = "+i);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
