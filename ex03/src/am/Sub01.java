package am;

import java.util.*;

public class Sub01 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		boolean run = true;
		ArrayList<String> names= new ArrayList<>();
		ArrayList<Integer> kors= new ArrayList<>();
		ArrayList<Integer> engs= new ArrayList<>();
		ArrayList<Integer> mats= new ArrayList<>();
		
		names.add("홍길동"); kors.add(80); engs.add(77); mats.add(82);
		names.add("강감찬"); kors.add(90); engs.add(87); mats.add(83);
		
		while(run) {
		System.out.println("\n--------------------------------------------");
		System.out.println("1.성적등록|2.성적목록|3.성적조회|4.성적삭제|0.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택>");
		String menu= scan.nextLine();
		
		switch(menu) {
		
		case "1":
			System.out.print("이름>");
			names.add(scan.nextLine());
			System.out.print("국어점수>");
			kors.add(Integer.parseInt(scan.nextLine()));
			System.out.print("영어점수>");
			engs.add(Integer.parseInt(scan.nextLine()));
			System.out.print("수학점수>");
			mats.add(Integer.parseInt(scan.nextLine()));
			System.out.print("등록완료!");
			break;
			
		case "2":
			
			for(int i=0; i<names.size(); i++) {
				int tot= kors.get(i) + engs.get(i) + mats.get(i);
				double avg= tot/3;
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", names.get(i), kors.get(i), engs.get(i), mats.get(i), tot, avg);
			}
			
			double tot_kor=0; 
			double tot_eng=0;
			double tot_mat=0;
			
			for(int i=0; i<names.size(); i++) {
				tot_kor= tot_kor+kors.get(i);
				tot_eng= tot_eng+engs.get(i);
				tot_mat= tot_mat+mats.get(i);
				}
			System.out.println("-----------------------------");
			System.out.printf("평균:\t%.2f\t%.2f\t%.2f\n", (double)tot_kor/kors.size(), (double)tot_eng/engs.size(), (double)tot_mat/mats.size());
			System.out.println("-----------------------------");
			System.out.println(names.size()+"명 성적이 존재합니다.");
			break;
		case "3":
			System.out.print("이름>");
			String sname=scan.nextLine();
			boolean find = true;
			for(int i=0; i<names.size(); i++) {
				if(names.get(i).equals(sname)) {
					System.out.println("국어:"+ kors.get(i));
					System.out.println("영어:"+ engs.get(i));
					System.out.println("수학:"+ mats.get(i));
					int tot= kors.get(i) + engs.get(i) + mats.get(i);
					System.out.println("총점:"+ tot);
					System.out.printf("평균:%.2f\n", (double)tot/3);
					System.out.println(sname+"의 성적을 조회합니다."); 
					find=false;
				}
					
				
			}
			if(find) {
			System.out.println("찾는 이름이 없습니다. 이름을 다시 입력해주세요.");}
			break;
		case "4":
			System.out.print("삭제할 이름>");
			String dname=scan.nextLine();
			find=true;
			for(int i=0; i<names.size(); i++) {
				if(names.get(i).equals(dname)) {
					System.out.println("국어:"+ kors.get(i));
					System.out.println("영어:"+ engs.get(i));
					System.out.println("수학:"+ mats.get(i));
					int tot= kors.get(i) + engs.get(i) + mats.get(i);
					System.out.println("총점:"+ tot);
					System.out.printf("평균:%.2f\n", (double)tot/3);
					System.out.println(dname+"의 성적을 조회합니다."); 
					find=false;				
				System.out.println("삭제하실래요?(y/Y)");
				String ans = scan.nextLine();
				if(ans.equals("Y")|| ans.equals("y")) {
					names.remove(i);
					kors.remove(i);
					engs.remove(i);
					mats.remove(i);
					System.out.println("삭제완료!");
				}else {
					System.out.println("삭제취소!");
				}
			}else {
				System.out.println(dname+"이 존재하지 않습니다.");
				break;
			}
			}
			break;
		case "0":
			run=false;
			break;
		default:
			System.out.println("0~4번 메뉴를 선택하세요!");
		}//switch
		
		}//while
		System.out.println("프로그램을 종료합니다.");
	}
}
