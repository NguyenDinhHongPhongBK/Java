package Enum;

import java.util.ArrayList;
import java.util.Collections;



public class TestEnum {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Torres",9));
		list.add(new Student("Raheem",6));
		list.add(new Student("Marko",10));
		list.add(new Student("Sergio",5));
		list.add(new Student("Gabriel",7.5));
		list.add(new Student("Kevin",3));
		list.add(new Student("Kluivert",4.5));
		list.add(new Student("Marson",5.5));
		list.add(new Student("Thomas",6.5));
		for(Student student : list) {
			System.out.println(student);
		}
		
		Collections.sort(list);
		System.out.println("Student list after sort");
		for(Student student : list) {
			System.out.println("\t" + student);
		}
	}

}
