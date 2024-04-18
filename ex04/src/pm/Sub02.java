package pm;

import java.io.*;
import java.util.StringTokenizer;

import am.Car;

public class Sub02 {
	public static void run() {
		File file=new File("c:/data/java/car.txt");
		try {
			BufferedReader readr= new BufferedReader(new FileReader(file));
			String line ="";
			StringTokenizer st = null;
			while((line=readr.readLine()) !=null) {
				st=new StringTokenizer(line,",");
				String no=st.nextToken();
				String company=st.nextToken();
				String model=st.nextToken();
				String color=st.nextToken();
				String distance=st.nextToken();
				String date=st.nextToken();
				
				Car car=new Car(Integer.parseInt(no), company, model, color, Integer.parseInt(distance), date);
				
				System.out.println("번호:"+ car.getNo());
				System.out.println("회사:"+ car.getCompany());
				System.out.println("모델:"+ car.getModel());
				System.out.println("색상:"+ car.getColor());
				System.out.println("주행거리:"+ car.getDistance());
				System.out.println("차량연식:"+ car.getDate());
				System.out.println("--------------------------------");

			}	
		}catch(Exception e) {
			System.out.println("오류"+ e.toString());
		}
	}

}
