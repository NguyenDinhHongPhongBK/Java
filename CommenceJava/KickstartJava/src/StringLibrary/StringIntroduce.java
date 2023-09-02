package StringLibrary;

public class StringIntroduce {

	public static void main(String[] args) {
		String s1 = new String("This HTML tutorial also contains nearly 100 HTML exercises.");
		String s2 = new String();
		s2  = "Phong";
		String s3 = "Phong";
		// equal
		if(s2.equals(s3))
			System.out.println("s2 is the same of s3");
		// indexOf
		int a = s1.indexOf('s');
		System.out.println(a);
		
		// lastIndexOf
		int b = s1.lastIndexOf("cises");
		System.out.println(b);
		
		// contains
		String s4 = "also";
		boolean c = s1.contains(s4);
		if(c)
			System.out.println("s1 contains 'also'");
		
		//split
		int count = 0;
		String[] ArrStr = s1.split(" ");
		for(int i = 0;i < ArrStr.length;i++) {
			if(ArrStr[i].equals("HTML"))
				count ++;
		}
		System.out.println("HTML appear "+count +" times");
		
		//subString
		try {
			String sub = s1.substring(3, 19);
			System.out.println(sub);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// replace && replaceFirst
		String s1FirstReplace = s1.replaceFirst("HTML", "CSS");
		System.out.println(s1FirstReplace);
		String s1Replace = s1.replace("HTML", "CSS");
		System.out.println(s1Replace);
		
		
		
		
	}

}








































