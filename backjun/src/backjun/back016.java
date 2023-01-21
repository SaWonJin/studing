package backjun;

import java.util.Scanner;

public class back016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		System.out.println((a>=90)?"A" : (a>=80)?"B" :(a>=70)?"C":(a>=60)?"D":"F");
	}

}
