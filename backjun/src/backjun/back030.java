package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back030 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		for(int i =0; i<a; i++) {
			for(int k =0; k<a-(i+1); k++) {
				System.out.print(" ");
			}
			for(int j =0; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
