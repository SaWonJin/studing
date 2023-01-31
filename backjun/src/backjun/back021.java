package backjun;

import java.util.Scanner;

public class back021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a ,b ,c, m;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println(10000+(a*1000));
		}else if (a==b ||b==c||a==c) {
			if(a==b) {
				System.out.println(1000+(a*100));				
			}else if(b==c) {
				System.out.println(1000+(b*100));								
			}else if(a==c) {
				System.out.println(1000+(a*100));				
			}
		}else {
			 if (a >= b && a >= c) {
		            m = a;
		        } else if (b >= a && b >= c) {
		            m = b;
		        } else {
		            m = c;
		        }
			System.out.println(m*100);
		}
	}

}
