package backjun;

import java.util.Scanner;

public class back011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		String b;
		
		a = sc.nextInt();
		b = sc.next();
		
		int c = b.charAt(0)-'0';
		int d = b.charAt(1)-'0';
		int e = b.charAt(2)-'0';
		
		System.out.println(a*e);
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*Integer.parseInt(b));
		
	}

}
