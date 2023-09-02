package DateLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class DateTime {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println("Year : "+year);
		
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Today is " + sdf.format(d));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Now is " + sdf1.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println("Now is " + sdf2.format(d));
		
		
		do {
			System.out.print("Enter date of birdth : ");
			@SuppressWarnings("resource")
			String birth = new Scanner(System.in).nextLine();
			SimpleDateFormat birthday = new SimpleDateFormat("dd/MM/yyyy");
			try {
				
				Date b = birthday.parse(birth);
				cal.setTime(b);
				int birthYear = cal.get(Calendar.YEAR);
				System.out.println("Your age :  " + (year - birthYear));
				if(birthYear < 1900) {
					System.out.println("Input again");
				}
				else {
					break;
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
			
		}while(true);
	}
}