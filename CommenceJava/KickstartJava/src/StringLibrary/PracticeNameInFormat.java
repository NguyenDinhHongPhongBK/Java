package StringLibrary;

import java.util.Scanner;

public class PracticeNameInFormat {

	public static String ChangeToCorrectFormat(String Name) {
		String name = Name;
		name = name.trim();
		String[] ArrName = name.split("\\s+");
		if(ArrName.length == 0) return "";
		String formatName = "";
		for(String word : ArrName) {
			String newWord = word.toLowerCase();
			newWord = newWord.replaceFirst((newWord.charAt(0)+""), (newWord.charAt(0)+"").toUpperCase());
			formatName += newWord + " ";		
		}
		return formatName.trim();
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String name;
		while(true) {
			System.out.print("Enter name : ");
			name = new Scanner(System.in).nextLine();
			name = ChangeToCorrectFormat(name);
			System.out.println(name);
			if(name.equals("#")) break;
		}
	}

}




























