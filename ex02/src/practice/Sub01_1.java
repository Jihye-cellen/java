package practice;

import java.util.Scanner;

public class Sub01_1 {
	public static void run() {
		System.out.println("의류관리프로그램");
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		String[] types = new String[100];
		String[] colors = new String[100];
		int[] prices = new int[100];
		int[] qnt = new int [100];
		
		int count = 2;
		
		types[0]="바지"; colors[0]="청색"; prices[0]= 35000; qnt[0]=50;
		types[1]="바지"; colors[1]="흰색"; prices[1]= 25000; qnt[1]=40;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("\t1.의류등록|2.의류현황|0.프로그램종료");
			System.out.println("------------------------------------------");
		
			System.out.print("선택>");
			String menu = scan.nextLine();
			
			switch(menu) {
			
			case "1":
				boolean go = true;
				while(go) {
				System.out.print("의류타입>");
				String type= scan.nextLine();
				if(type=="") {
					System.out.println("입력을 종료합니다.");
				break;
				}//type if
				
				System.out.print("의류색>");
				String color= scan.nextLine();
				if(color=="") {
					System.out.println("입력을 종료합니다.");
				break;
				
				}//color if
				go=false;
				
				System.out.print("의류가격>");
				int price = scan.nextInt();
				
				System.out.print("의류개수>");
				int qn= scan.nextInt();
				
			
				types[count]=type;
				colors[count]=color;
				prices[count]=price;
				qnt[count]=qn;
				count++;
				System.out.println("의류입력이 종료되었습니다.");
				}
				break;
				
			case "2":
				System.out.println("의류타입\t색\t가격\t개수\n");
				int tot = 0;	
				for(int i=0; i<count; i++) {
					int sum = prices[i]*qnt[i];
					tot += sum;
					System.out.printf("%s\t%s\t%,d원\t%d벌\n", types[i],colors[i],prices[i], qnt[i]);
				}System.out.println("------------------------------------------");
				System.out.println("총판매액:"+tot);
				break;
			case "0":
				run=false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("0~2번을 눌러주세요!");
			}
			
		}
	}
}
