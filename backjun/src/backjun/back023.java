package backjun;

import java.util.Scanner;

public class back023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b ,c ;
		a = sc.nextInt();
		
		for(int i =0; i<a; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			
			System.out.println(b+c);
		}
	}
}
