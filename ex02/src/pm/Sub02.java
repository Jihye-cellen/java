package pm;

import java.util.*;

public class Sub02 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> names= new ArrayList<>();//배열을 만들때는 방의 크기를 지정해야하는데, arraylist는 따로 지정하지 않아도 된다. 
		names.add("홍길동"); //데이터 입력: 이름.add("추가하고 싶은 데이터 내용")
		names.add("심청이");
		names.add("강감찬");
		names.add("성춘향");
		names.add("이몽룡");
		
		names.remove(1); //데이터 삭제: 이름.remove(인덱스번호);
		
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i); //ArrayList - 이름.size, names.get(i): 인덱스가 없어 get으로 표현
			System.out.println(name);
			} 
		
		while(true) {
		System.out.print("검색할이름>");
		String sname=scan.nextLine();
		if(sname=="") {
			System.out.println("검색을 종료합니다.");
			break;
		}
		
		boolean find = false;
		for(int i=0; i<names.size(); i++) {
			String name= names.get(i);
			if(sname.equals(name)){ //equals는 sname에 있는 값을 비교하는데 사용
				find=true;
				System.out.println("존재합니다");
			}
		}if(find==false) {
			System.out.println("존재하지않습니다");
		}
		
		}
 
	}
}
