package ex01;

public class Sub06 {
	public static void run() {
		//반복문(for, while)
		//for문
		int sum = 0;
		for(int i=1; i<=100; i=i+1) { //1씩 증가시켜서 i에 저장
			sum+=i;//i에 대한 합계를 sum에 저장
		}
		System.out.println("1~100합계:"+ sum); //sysout은 아예 for문을 나와서 작성
		
		sum = 0; //위에서 int로 선언했기 때문에 int를 쓰면 오류가 난다
		for(int i=1; i<=100; i=i+2) { 
			sum+=i;
		}
		System.out.println("1~100중 홀수 합계:"+ sum); 
		
		sum = 0;
		for(int i=0; i<=100; i=i+2) { 
			sum+=i;
		}
		System.out.println("1~100중 짝수 합계:"+ sum); 
		
		
		//while문 = 무한반복때 많이 사용
		int i = 1; //for문 안에 있는 변수를 지역변수라 하며, 새로 i를 써도 int를 선언할수가 있다
		sum=0;
		
		while(i<=100) {
			sum=sum+i;
			i=i+1;
		} System.out.println("1~100합계:"+ sum);
		
		i=1;
		sum=0;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}System.out.println("1~100중 홀수 합계:"+ sum);
		
		i=0;
		sum=0;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}System.out.println("1~100중 짝수 합계:"+ sum);
}
}