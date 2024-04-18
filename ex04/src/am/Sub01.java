package am;

import java.util.*;

public class Sub01 {
	public static void run() {
		    boolean run=true;
		    
		    ArrayList<Car> cars=new ArrayList<>();
		      Scanner scan=new Scanner(System.in);
		      Car car=new Car(1, "현대", "그랜저", "검정", 20000, "2020-03");
		      cars.add(car);
		      car=new Car(2, "쌍용", "티볼리", "파랑", 60000, "2019-06");
		      cars.add(car);
		      car=new Car(3, "기아", "k7", "흰색", 120000, "2021-04");
		      cars.add(car);
		      
		      while(run) {
		         System.out.println("--------------------------------------------");
		         System.out.println("1.차량등록|2.차량조회|3.차량목록|4.차량삭제|0.종료");
		         System.out.println("--------------------------------------------");
		         System.out.print("선택>");
		         String menu=scan.nextLine();
		         switch(menu) {
		         case "1":
		        	 
		        	 car=new Car();
		        	 Car last=cars.get(cars.size()-1);
		        	 int next = last.getNo()+1;
		        	 car.setNo(next);
	        		 System.out.println("차량번호"+car.getNo());
	   
		        	 System.out.print("차량회사>");
		        	 String company=scan.nextLine();
		        	 car.setCompany(company);
		        	 
		        	 System.out.print("차량모델>");
		        	 String model=scan.nextLine();
		        	 car.setModel(model);
		        	 
		        	 System.out.print("차량색>");
		        	 String color=scan.nextLine();
		        	 car.setColor(color);
		        	 
		        	 System.out.print("차량연식>");
		        	 String date = scan.nextLine();
		        	 car.setDate(date);
		        	 
		        	 System.out.print("주행거리>");
		        	 int distance = scan.nextInt();
		        	 car.setDistance(distance);
		        
		        	 cars.add(car);
		        	
		        	 System.out.println(car.toString()+"\n데이터가 등록되었습니다.");
		            break;
		            
		            
		         case "2":
		        	 boolean find = false;
		        	 while(true) {
		        	 System.out.print("\n조회할차량(모델, 색상, 회사)>");
		        	 String sname=scan.nextLine();
		        	 if(sname=="")break;
		        	 System.out.println("번호\t회사\t모델\t색깔\t주행거리\t차량연식");
		        	 System.out.println("==========================================");
		        		 for(Car c:cars) {
		        			 if(sname.equals(c.getColor())|| sname.equals(c.getCompany())|| 
		        					 sname.equals(c.getColor())) {
		        				 c.print();
		        				 find=true;
		        		 }
		        			
		        		 } if(!find) {
	        				 System.out.println("찾으시는 데이터가 없습니다.");
	        			 }
		        	 }
		            break;
		         case "3":
		        	 for(Car s:cars) {
		        		 System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n", s.getNo(), s.getCompany(), s.getModel(), 
		        				 s.getColor(), s.getDistance(), s.getDate());
		        	 }
		        	 System.out.println("==========================================");
		        	 System.out.println(cars.size()+ "대의 차량이 존재합니다.");
		            break;
		         case "4":
		        	 find=false;
		        	 while(true) {
			        	 System.out.print("삭제할차량(모델>)");
			        	 String dname=scan.nextLine();
			        	 if(dname=="") {break;}
			        	 for(Car d:cars) {
			        		 if(dname.equals(d.getModel())) {
			        			 d.print();
			        			 System.out.print("삭제하시겠습니까?(Y/N)");
			        			 String ans=scan.nextLine();
			        			 if(ans.equals("Y")||ans.equals("y")) {
			        				 cars.remove(d);
			        				 System.out.println("삭제완료");
			        				 break;
			        			 }else if(ans.equals("N")||ans.equals("n")) {
			        				 System.out.println("삭제취소");
			        			 }else {
			        				 System.out.println("잘못입력했습니다.");
			        			 }
			        		 }//if
			        	 }//for
		        	 }//while
		            break;
		         case "0":
		            System.out.println("프로그램을 종료합니다.");
		            run=false;
		            break;
		         default:
		            System.out.println("0~4메뉴를 선택하세요!");
		         }
		      }//while
		   }//run
}
