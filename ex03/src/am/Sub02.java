package am;

public class Sub02 {
	public static void run() {
		System.out.println("클래스란?"); //student = class, s1/s2/s3 = object, student()= 생성자, no/name/juso/phone=필드
		Student s1=new Student(); //생성자1
		s1.no="100";
		s1.name="홍길동";
		s1.juso="인천";
		s1.phone="010-1010-1010";
		s1.print();
		
		System.out.println("----------------------");
		Student s2=new Student("101", "이순신"); //생성자2
		s2.juso="서울";
		s2.phone="010-1010-2020";
		s2.print();
		
		System.out.println("----------------------");
		Student s3=new Student("102", "강감찬", "서울", "010-1010-3030");
		s3.print();
	
	}//method
}//class