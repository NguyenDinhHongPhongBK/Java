package StringLibrary;

import java.util.StringTokenizer;

public class StringTokenizerLibrary {

	public static void main(String[] args) {
		String str = "Apple,Waterlemon,Lemon,Orange";
		//Phiên bản cũ
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+"	");
		}
		System.out.println("\n__________");
		
		// Cách hiện đại 
		String str2 = "Table-Wardrobe-Chair-Desk";
		String[] arrStr = str2.split("-");
		for(int i = 0 ;i<arrStr.length;i++)
			System.out.print(arrStr[i]+"	");
		boolean a =  str2.equals(str);
		System.out.println("\n"+a);
		

	}

}
