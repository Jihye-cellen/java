package practice;

import java.util.*;

public class Sub01_2 {
	public static void run() {
		ArrayList<Order> order= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		Order order1= new Order("자켓", "청색", 35000, 25);
		order.add(order1);
		
		boolean run = true;
		while(run) {
		 System.out.println("--------------------------------------------");
         System.out.println("1.의류등록|2.의류조회|3.의류목록|4.의류삭제|0.종료");
         System.out.println("--------------------------------------------");
         System.out.print("선택>");
         String menu=scan.nextLine();
         
         
         switch(menu) {
         
         case "1":
        	 break;
         case "2":
        	 break;
         case "3":
        	 break;
         case "4":
        	 break;
         case "0":
        	 run=false;
        	 System.out.println("프로그램을 종료합니다.");
        	 break;
         default:
        	 System.out.println("0~4번 메뉴를 선택하세요");
        	 
        
         }
	}
}
	}