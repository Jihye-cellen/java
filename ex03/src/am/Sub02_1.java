package am;

import java.util.*;

public class Sub02_1 {
	public static void run() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("100", "홍길동", "인천", "010-1010-1010"));
		students.add(new Student("101", "강감찬", "서울", "010-1010-2020"));
		students.add(new Student("102", "심청이", "부산", "010-1010-3030"));
		
		for(Student s:students) {
			s.print();
		}
		
	}
}