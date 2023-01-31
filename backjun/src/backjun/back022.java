package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back022 {

	public static void main(String[] args) throws IOException{
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bp.readLine());
		
		for(int i=1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
