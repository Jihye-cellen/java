package ex01;

public class Sub03 {
	public static void run() {
		//정수타입
		int num1=10;
		
		//실수타입
		float num2=11.5f;
		double num3=12.5;
		
		System.out.println("num1="+ num1);
		System.out.println("num2="+ num2);
		System.out.println("num3="+ num3);
		
		//문자타입

		char str1 = 'A';
		String str2 = "홍길동";
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		
		//불린타입
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("bool1="+bool1);
		System.out.println("bool2="+bool2);
		
		//형변환(정수를 실수로 변환 - 정수는 실수 안에 들어가므로 오류가 나지 않는다)
		num2 = num1;
		System.out.println("num2="+num2);
		num3 = num1;
		System.out.println("num3="+num3);
		
		//형변환(실수를 정수로 변환- 실수는 정수보다 큰 형태이기 때문에 바로 넣으면 오류가 난다. 강제형변환을 해줘야한다.)
		num1 = (int)num2; //()변수명; 
		System.out.println("num1="+num1);
		num1 = (int)num3;
		System.out.println("num1="+num1); //현재 상황으로는 위에 있는 코드때문에 대입이 미리 되었던 num2,3의 값이 대입이 되므로 10이 나옴
	}
}
