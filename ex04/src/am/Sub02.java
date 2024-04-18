package am;

import java.util.*;

public class Sub02 {
	
	public static void run() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArrayList <Juso> jusos = new ArrayList <>();
		
		Juso juso1 = new Juso(1,"홍길동", "010-2020-5454", "인천");
		jusos.add(juso1);
		juso1 = new Juso(2,"이순신", "010-2558-5447", "서울");
		jusos.add(juso1);
		juso1 = new Juso(3,"강감찬", "010-7251-5789", "경기");
		jusos.add(juso1);
		
		while(run) {
		System.out.println("------------------------------------------");
		System.out.println("1.주소등록|2.주소조회|3.주소목록|4.주소삭제|0.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택>");
		String menu = scan.nextLine();
		
		switch(menu) {
		
		case "1":
			Juso juso = new Juso();
			System.out.print("이름>");
			String name = scan.nextLine();
			juso.setName(name);
			System.out.print("주소>");
			String address = scan.nextLine();
			juso.setAddress(address);
			System.out.print("전화번호>");
			String phone = scan.nextLine();
			juso.setPhone(phone);
			jusos.add(juso);
			System.out.println(juso.toString()+ "\n" + "등록완료!");
			System.out.println("등록된데이터:" + jusos.size());
			break;
			
		case "2":
			while(true) {
				System.out.print("조회할이름>");
				String sname=scan.nextLine();
				if(sname=="")break; //while문에 대한 break;
				boolean find = false;
				for(Juso j:jusos) {
					if(sname.equals(j.getName()))
					{
						System.out.println("주소:"+ j.getAddress());
						System.out.println("전화:"+ j.getPhone());
						find=true;
						}//if
					}//for
				if(!find) {
					System.out.println(sname + "데이터가 존재하지 않습니다.");
				}
		}//while
			break;
			
			
		case "3":
			for(Juso s:jusos) {
				System.out.printf("%s\t%s\t%s\n", s.getName(), s.getAddress(), s.getPhone());
			}//for
			System.out.println("등록된데이터:" + jusos.size());
			break;
			
			
		case "4":
			System.out.print("삭제할이름>");
			String dname=scan.nextLine();
			boolean find=false;
			for(Juso j:jusos) {
				if(dname.equals(j.getName())) {
					System.out.println("주소:"+ j.getAddress());
					System.out.println("전화:"+ j.getPhone());
					find=true;
					System.out.println("삭제하시겠습니까? (y/n)");
					String answer = scan.nextLine();
					if(answer.equals("y")||answer.equals("Y")) {
						jusos.remove(j);
						System.out.println("삭제완료!");
						break;
						
					}//if(answer)
					else if(answer.equals("n")|| answer.equals("N")){
						System.out.println("삭제취소!");
					}//else if
					else {
						System.out.println("잘못입력하였습니다.");
					}
				}//if(dname)
			}//for
			break;
		case "0":
			run=false;
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("0~4번 메뉴를 입력해주세요.");
			
		}//switch
		}//while
	}//run
}//class
