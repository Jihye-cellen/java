package practice;

public class Order {
	
	private String type;
	private String color;
	private int price;
	private int qnt;//field
	
	
	public Order() {};
	public Order(String type, String color, int price, int qnt) {
		super();
		this.type = type;
		this.color = color;
		this.price = price;
		this.qnt = qnt;
	}//생성자

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	
	@Override
	public String toString() {
		return "Order [type=" + type + ", color=" + color + ", price=" + price + ", qnt=" + qnt + "]";
	}
	
	public int total() {
		int total = price * qnt;
				return total;
	}
	
	public void print() {
	 System.out.printf("%s\t%s\t%,d원\t%d개\t%d원\n", type, color, price, qnt, total());
	}
	
	
	
	
}//class

