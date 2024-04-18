package pm;

public class Sale {
	String code;
	String name;
	int price;
	int qnt;
	
	//생성자는 기본생성자를 생성할 경우 생성자 과정을 생략해도 된다. 
	
	public Sale() {} // 기본생성자

	public Sale(String code, String name, int price, int qnt) {
		super();
		this.code=code;
		this.name=name;
		this.price=price;
		this.qnt=qnt;
	}
	
	//금액을 구하는 메서드
	public int sum() {
		int sum = price * qnt;
		return sum;
	}
	
	public void print_land() {
		System.out.printf("%s\t%s\t%,d만원\t%d개\t%,d만원\n", code, name, price, qnt, sum());
	}
	
	public void print_port() {
		System.out.println("제품코드:"+ code);
		System.out.println("제품이름:"+ name);
		System.out.printf("가격:%,d만원\n",price);
		System.out.printf("수량:%d개\n",qnt);
		System.out.printf("금액:%,d만원\n",sum());
		
	}
	
	
	
	
}