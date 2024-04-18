package am;

import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("매출현황");
		boolean run = true;
		
		String[] names = new String[100];
		int[] prices = new int[100];
		int[] qnts = new int[100];
		
		names[0]="냉장고"; prices[0]=350; qnts[0]=20;
		names[1]="세탁기"; prices[1]=250; qnts[1]=14;
		int count = 2; //등록된 상품의 갯수
	
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("\t1.매출등록|2.매출현황|0.프로그램종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu=scan.nextLine();
			
			switch(menu) {
			case "1":
				System.out.print("제품명>");
				String name=scan.nextLine();
				System.out.print("가격>");
				String price=scan.nextLine();
				System.out.print("개수>");
				String qnt=scan.nextLine();
				
				names[count]=name;
				prices[count]=Integer.parseInt(price);
				qnts[count]=Integer.parseInt(qnt);
				count++;
				
				System.out.println("등록이 완료되었습니다.");
				break;
				
			case "2":
				System.out.println("제품명\t가격\t개수\t판매금액\n");
				int tot = 0;
				int tot_qnt = 0;
				for(int i=0; i<count; i++) {
					int sum=prices[i]*qnts[i];
					tot += sum;
					tot_qnt += qnts[i];
					System.out.printf("%s\t%,d만원\t%d개\t%,d만원\n",names[i], prices[i], qnts[i], sum);
				}System.out.println("------------------------------------------");
				System.out.printf("\t\t%d개\t%,d만원\n",tot_qnt,tot);
				System.out.println("------------------------------------------");
				System.out.println(count+"개 상품이 등록되었습니다.");
				break;
			
			case "0":
				run=false;
				break;
			
			default:
				System.out.println("0~2번을 선택하세요.");
	
			} //switch
			
			
			
			
			
		}//while
		System.out.println("프로그램을 종료합니다."); //while문을 빠져나감

	}//method
}//class
