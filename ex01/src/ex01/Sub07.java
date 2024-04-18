package ex01;

import java.util.Scanner;

public class Sub07 {
	public static void run(){
		Scanner s=new Scanner(System.in); //키보드에 입력하는 클래스, 변수를 쓰지 않아서 밑줄이 계속 생긴다.(오류 아님)
		boolean run = true;
		while(run){
			System.out.println("===========================================");
			System.out.println("1.100까지의합계|2.100까지홀수합계|3.100까지짝수합계|0.종료");
			System.out.println("===========================================");
			System.out.print("선택>");
			String menu = s.nextLine();//여기서의 s객체의 값을 여기서 키보드로 입력한다. 그리고서 menu에 들어간다. 
			
			switch(menu) { //메뉴
			case "1": 
				int i=0;
				int sum=0;
				for(i=1; i<=100; i++) {
					sum +=i;
				} System.out.println(sum);
				break;
			case "2":
				i=0;
				sum=0;	
				for (i=1; i<=100; i=i+2) {
					sum+=i;
				} System.out.println(sum);
				break;
			case "3":
				i=0;
				sum=0;
				for(i=0; i<=100; i=i+2) {
					sum+=i;
				}System.out.println(sum);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run=false; //현재 run변수에는 true가 들어가 무한반복을 하기 때문에 false를 넣어 반복문 자체를 실행시키지 않는 것이다
				break;
			default:
				System.out.println("0~3번 메뉴를 선택하세요.");
			
			}
		}
	}
}
