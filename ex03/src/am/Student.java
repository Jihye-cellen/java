package am;

public class Student {
	//field 클래스에는 필드가 들어간다. 학번=문자(연산하는 것이 아니기 때문에 문자로 취급)
	//클래스가 가질 수 있는 필드=속성 (property)
	String no;
	String name;
	String juso;
	String phone;
	
	//생성자1
	public Student() {
		
	}
	
	//생성자2
	public Student(String no, String name) {
		super();//생략가능
		this.no = no; //this=필드의 속성
		this.name = name;
	}

	
	//매개변수 순서를 바꾸면 안된다. //생성자3
	public Student(String no, String name, String juso, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.juso = juso;
		this.phone = phone;
	}

	//method = 명령어의 집합
	public void print() {
		System.out.printf("학번:%s\n이름:%s\n주소:%s\n전화:%s\n",no, name, juso, phone);
	}
	
}