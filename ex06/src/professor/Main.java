package professor;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		      boolean run = true;
		      Scanner scanner = new Scanner(System.in);		
		      ProDAO dao = new ProDAO();
		      while(run) {
		         System.out.println("\n=========================================");
		         System.out.println("1.등록|2.조회|3.목록|4.삭제|5.수정|0.종료");
		         System.out.println("=========================================");
		         System.out.print("선택>");
		         String menu= scanner.nextLine();
		         switch(menu) {
		            case "1" :
		            	ProVO pro = new ProVO();
		            	System.out.print("교수코드>");
		            	String pcode = scanner.nextLine();
		            	if(pcode=="") break;
		            	pro.setPcode(pcode);
		            	System.out.print("교수이름>");
		            	String pname = scanner.nextLine();
		            	if(pname=="")break;
		            	pro.setPname(pname);
		            	dao.insert(pro);
		            	System.out.print("교수등록완료!");
		               break;
		            case "2" :
		               break;
		            case "3" :
		            	for(ProVO vo :dao.list()) {
		            		System.out.println(vo.toString());
		            	}
		               break;
		            case "4" :
		               break;
		            case "5":
		            	break;
		            case "0" :
		               System.out.println("프로그램을 종료합니다.");
		               run = false;
		               break;
		            default:
		               System.out.println("0~4 메뉴를 입력하세요!");
		               break;
		         }//switch   
		      }//while
		 
	}

}
