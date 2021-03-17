import java.util.*;
//윤년
public class B2753 {
	public static void main (String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		if(a%4==0) {
			if(a%100!=0) {
				System.out.println(1);
			} else if(a%400==0) {
					System.out.println(1);
			} else {
					System.out.println(0);
			}
		}  else {
			System.out.println(0);
		}
		
	}
}
