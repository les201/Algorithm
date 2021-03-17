import java.util.*;
//알람시계 : 45분 전 알람 24시간 표현
public class B2884 {
	public static void main (String[] args) {
		int h,m;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();

		
		if(m>=45) {
			System.out.print(h + " " + (m-45));
		} else{
			h=h-1;
			m=15+m;
			if(h<0) {
				h= h+24;
			} System.out.print(h + " " + m);
			}
	
		}
}
