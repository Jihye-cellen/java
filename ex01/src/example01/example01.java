package example01;

import java.util.Scanner;

public class example01 { //체온기
	public static void run() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("체온을 입력해주세요>");
		float temp = s.nextFloat();
		
		if(temp<=36.5) {
			System.out.println("정상입니다.");
			return;
		}else if (temp<=37.5) {
			System.out.println("미열이 있으니 헤열제를 드시기 바랍니다.");
			return;
		}else if(temp<=39) {
			System.out.println("당장 병원 방문이 시급합니다.");
			return;
		}else {
			System.out.println("다시 입력해주시기 바랍니다.");
		}
	}
}
