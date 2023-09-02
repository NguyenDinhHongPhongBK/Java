package DemoSaveFile;


import java.util.ArrayList;

import SerializeFile.Customer;

public class TestSaveFile {

	public static void main(String[] args) {
//		ArrayList<String> dinosaurs = new ArrayList<String>();
//		dinosaurs.add("Spinosaurus");
//		dinosaurs.add("Giganotosaurus");
//		dinosaurs.add("Therizinosaurus");
//		dinosaurs.add("Quetzalcoatlus");
//		dinosaurs.add("Khủng long cổ dài");		
//		
//
//		
//		boolean r = FileFactory.SaveFile(dinosaurs,"E:/Data.txt");
//		if(r)
//			System.out.println("Save Successfully");
//		else {
//			System.out.println("Save fail");
//		}
		ArrayList<String> dinosaurs = new ArrayList<String>();
		dinosaurs = (ArrayList<String>) FileFactory.ReadFile("E:/Data.txt");
		for(String s : dinosaurs) {
			System.out.println(s);
		}
	}

}
