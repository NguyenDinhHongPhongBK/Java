package StringLibrary;

public class StringMethod {

	public static void main(String[] args) {
		String str1 = "Java is used to develop mobile apps, "; // web apps, desktop apps, games and much more."
		String str2 = "PHonG";
		String str3 = "Phong";
		String str4 = "Hi";
		
		// equal (return to boolean)
		boolean c = str3.equals("Phong");
		if(c)
			System.out.println("str3 is Phong");
		
		// compare (return to number)
		int c1 = str2.compareTo(str3);
		System.out.println(c1);
		
		// compareToIgnoreCase
		int c2 = str2.compareToIgnoreCase(str3); //compare without distinguish between upper-case and lower-case
		System.out.println(c2);
		
		// concat
		str4 = str4.concat(", my name is ");
		str4 = str4.concat(str3);
		System.out.println(str4);
		
		//insert by StringBuffer
		StringBuffer sb = new StringBuffer(str1);
		sb.insert(str1.length(), "web apps");
		str1 = sb.toString();
		System.out.println(str1);
		
		// toLowerCase
		str2 = str2.toLowerCase();
		System.out.println(str2);
		
		// toUpperCase
		str3 = str3.toUpperCase();
		System.out.println(str3);
		
		str2 = str2.replaceFirst((str2.charAt(0))+"",(str2.charAt(0)+"").toUpperCase()); // +"" to convert to String
		System.out.println(str2);
	}

}

