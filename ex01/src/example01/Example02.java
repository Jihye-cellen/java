package example01;

public class Example02 {
	public static void run() { //마일리지 추가 적립 시스템(최대 마일리지 500)
		int mail = 400;
		int tot = 0;
		int ma= mail/10;
		
		if(ma<10) {
			for(int i=0; i<=ma; i++) {
				tot=ma+(i/4);
			}System.out.println("추가로 적립된 마일리지:"+ tot);
		}else if(ma<30) {
			for(int i=0; i<=mail; i++) {
				tot=ma+(i/3);
			}System.out.println("추가로 적립된 마일리지:"+ tot);
		}else if(ma<50) {
			for(int i=0;i<=ma; i++) {
				tot=ma+(i/2);
			}System.out.println("추가로 적립된 마일리지:"+ tot);
		}
	}
}
