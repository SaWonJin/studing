package backjun;

import java.util.Scanner;

public class back020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h, m ,rt ,a,b;
		h = sc.nextInt();
		m = sc.nextInt();
		rt = sc.nextInt();
		
		h = 60*h+m; // 시+분 
		a = h+rt; //시 +분 +입력시간
		
		h = (a/60)%24; //60으로 나눈 값이 24 이상일 경우 0부터 시작해야해서 24의 나머지를 구함
		m = a%60; //60으로 나눈 나머지값이 분 값이 된다. 
		
		System.out.println(h+" "+m);

	}

}
