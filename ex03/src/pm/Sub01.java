package pm;

import java.util.*;

public class Sub01 {
	public static void run() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Sale> sales = new ArrayList<>();
		Sale s1= new Sale();
		s1.code="100";
		s1.name="냉장고";
		s1.price=350;
		s1.qnt=15;
		sales.add(s1);
		
		Sale s2=new Sale("101", "세탁기", 270, 25);
		sales.add(s2);
		
		while(run) {
			System.out.println("\n----------------------------------------");
			System.out.println("1.매출등록|2.매출목록|3.상품조회|4.매출삭제|0.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			String menu=scan.nextLine();
			
			switch(menu) {
			case"1":
				Sale s3=new Sale();
				Sale last=sales.get(sales.size()-1); 
				int code=Integer.parseInt(last.code)+1;
				s3.code= code + ""; //int+string = string, string.valueof();
				System.out.println("상품코드>"+s3.code );
				
				System.out.print("상품이름>");
				s3.name=scan.nextLine();
				if(s3.name=="")break;
				while(true) {
					System.out.print("상품가격>");
					String price = scan.nextLine();
						if(checkNumber(price)) {
							s3.price=Integer.parseInt(price);
							break;
						}
				}
				
				while(true) {
					System.out.print("판매수량>");
					String qnt = scan.nextLine();
					if(checkNumber(qnt)) {
					s3.qnt=Integer.parseInt(qnt);
					break;
				}
			}
				sales.add(s3);
				System.out.println("상품등록완료!");
				
			case"2":
				int tot_qnt=0;
				int tot_sum=0;
				System.out.println("코드\t제품\t가격\t개수\t총금액\n");
				for(Sale s:sales) {
					s.print_land();
					tot_qnt =tot_qnt + s.qnt;
					tot_sum =tot_sum + s.sum();
				}
				System.out.println("----------------------------------------");
				System.out.printf("총판매수량:%d개\n", tot_qnt);
				System.out.printf("총판매금액:%,d만원\n",tot_sum);
				System.out.println("----------------------------------------");
				System.out.println(sales.size()+"개 상품이 존재합니다.");
				break;
				
			case"3":
				while(true) {
					System.out.print("조회상품명/코드>");
					String sname=scan.nextLine();
					if(sname=="") {
						System.out.println("상품조회를 종료합니다.");
						break;
					}
					boolean find = false;//sname이 찾지 못했을때 
					for(Sale s:sales) {
						if(s.name.equals(sname) || s.code.equals(sname)) {
							s.print_port();
							System.out.println("");
							find=true;
						}
					}//for
					if(!find) {
						System.out.println(sname+"상품이 존재하지 않습니다.\n");
					}
				}//while
				break;
				
			case"4"://매출삭제
				System.out.println("삭제할상품명/상품코드>");
				String dname=scan.nextLine();
				boolean find=false;
				for(Sale s:sales) {
					if(s.name.equals(dname)||s.code.equals(dname)) {
						s.print_port();
						find=true;
						System.out.println("삭제하실래요(Y/y)");
						String ans=scan.nextLine();
						if(ans.equals("Y")||ans.equals("y")){
							sales.remove(s);
							System.out.println("삭제완료!");
							break;
						}else {
							System.out.println("삭제취소!");
						}
						
					}
				}if(!find) {
					System.out.println(dname+"상품이 존재하지 않습니다.");
				}
				break;
				
			case"0":
				run= false;
				break;
				
			default:
				System.out.println("0~4번 메뉴를 선택하세요.");
			}//switch
		}	System.out.println("프로그램 종료");
		//while
	}//method
	//숫자인지 아닌지 판별하는 메서드
	public static boolean checkNumber(String str) {
		try {
			int num=Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("숫자로 입력하세요!");
			return false;
			
		}
	}
}//class