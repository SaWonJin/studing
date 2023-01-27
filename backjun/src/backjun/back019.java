package backjun;

import java.util.Scanner;

public class back019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h,m;

		h= sc.nextInt();
		m= sc.nextInt();
		sc.close();
		
		if( m>=45) {
			m = m-45;
			System.out.print(h+" "+m);
		}else {
			h--;
			if(h<0) {
				h=23;
			}
			m = m+15;
			System.out.print(h+" "+m);
		}
	}
}
