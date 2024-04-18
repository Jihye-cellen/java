package sale;

import java.text.*;
import java.util.*;

import product.*;


public class Sub {
	public static void run() {
		  boolean run = true;
	      Scanner scanner = new Scanner(System.in);
	      DecimalFormat format = new DecimalFormat();
	      SaleDAO dao = new SaleDAO();
	      ProductDAO pdao =new ProductDAO();
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	      while(run) {
	         System.out.println("\n=========================================");
	         System.out.println("1.판매등록|2.판매조회|3.판매목록|4.판매삭제|0.종료");
	         System.out.println("=========================================");
	         System.out.print("선택>");
	         String menu= scanner.nextLine();
	         switch(menu) {
	            case "1" :
	            	System.out.print("상품코드>");
	            	String code1 = scanner.nextLine();
	            	ProductVO vo1=pdao.read(code1);
	            	if(vo1.getCode()==null) {
	            		System.out.println(code1+"번 상품이 존재하지 않습니다.");
	            	}else {
	            		SaleVO svo= new SaleVO();
	            		System.out.println("상품명:" + vo1.getName());
	            		String today= sdf.format(new Date());
	            		System.out.println("판매일:" + today +">");
	            		String date = scanner.nextLine();
	            		if(date!="") {
	            			svo.setSale_date(date);
	            		}else {
	            			svo.setSale_date(today);
	            		}
	            		System.out.println("판매가:" + vo1.getPrice()+">" );
	            		String price = scanner.nextLine();
	            		if(price!="") {
	            			svo.setPrice(Integer.parseInt(price));
	            		}else {
	            			svo.setPrice(vo1.getPrice());
	            		}
	            		System.out.print("수량>");
	            		String qnt = scanner.nextLine();
	            		if(qnt!="") {
	            			svo.setQnt(Integer.parseInt(qnt));
	            		}else {
	            			svo.setQnt(1);
	            		}
	            		svo.setCode(code1);
	            		System.out.println(svo.toString()); 
	            		dao.insert(svo);
	            		System.out.println("매출등록완료!");
	            	
	            		
	            	}
	            	
	               break;
	            case "2" :
	            	System.out.print("조회할상품코드>");
	            	String code2 = scanner.nextLine();
	            	ProductVO vo2 = pdao.read(code2);
	            	if(vo2.getCode()==null) {
	            		System.out.println(code2 + "번 상품이 존재하지 않습니다.");
	            	}else {
	            		System.out.println("상품이름:"+vo2.getName());
	            		System.out.println("상품단가:"+format.format(vo2.getPrice()));
	            	}
	               break;
	            case "3" :
	            	for(SaleVO vo:dao.list()) {
	            		System.out.printf("%s\t%s(%s)\t%d개\t%,d원\n", 
	            				vo.getSale_date(),vo.getName(),vo.getCode(),vo.getQnt(), vo.getPrice());
	            	}
	               break;
	            case "4" :
	               break;
	            case "0" :
	               System.out.println("판매관리를 종료합니다.");
	               run = false;
	               break;
	            default:
	               System.out.println("0~4 메뉴를 입력하세요!");
	               break;
	         }//switch   
	      }//while

	}
}
