package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back024 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bp.readLine());
		
		int b=0;
		for(int i=1; i<(a+1); i++) {
			b = b+i;
		}
		System.out.println(b);
	}
}
