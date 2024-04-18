package am;

import java.util.Scanner;

public class Sub03 {
 public static void run() {
	 System.out.println("주소관리");
	 Scanner scan = new Scanner(System.in);
	 String[] names=new String[100];
	 String[] jusos=new String[100];
	 String[] phones=new String[100];
	 int count = 0;
	 
	 boolean run = true;
	 while(run) {
		 System.out.println("\n-------------------------------------------------");
		 System.out.println("\t1.주소등록|2.주소현황|0.프로그램종료");
		 System.out.println("---------------------------------------------------");
		 System.out.print("선택>");
		 String menu = scan.nextLine();
		 
		switch(menu) {
		case "1":
			while(true) {
			System.out.print("이름>");
			String name = scan.nextLine();
			if(name=="") {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.print("주소>");
			String juso = scan.nextLine();
			if(juso=="") {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.print("전화번호>");
			String phone = scan.nextLine();
			if(phone=="") {
				System.out.println("입력을 종료합니다.");
				break;
			}
			names[count]=name;
			jusos[count]=juso;
			phones[count]=phone;
			count++;
			System.out.println(name + "주소가 종료되었습니다.");
			}
			
			
		case "2":
			System.out.println("이름\t주소\t전화번호");
			if(count==0) {
				System.out.println("등록된 주소가 없습니다.");
			}else {
				for(int i=0; i<count; i++) {
					System.out.printf("%s\t%s\t%s\n", names[i], jusos[i], phones[i]);
				}
			}System.out.println(count + "명이 존재합니다.");
			
			System.out.println("-----------------------------------");
			break;
			
		case "0":
			run=false;
			System.out.println("프로그램이 종료되었습니다.");
			break;
			
		default:
			System.out.println("0~2을 입력하세요");
		}
	 }
 }
}
