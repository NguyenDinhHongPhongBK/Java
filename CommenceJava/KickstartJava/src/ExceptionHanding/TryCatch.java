package ExceptionHanding;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 10;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			int z = y/x;
			System.out.println("z = " + z);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			System.out.println("Thank you");
		}
	}
}
