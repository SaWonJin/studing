package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back032 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a;
		int b,c;
		
		StringTokenizer st;
				
		while ((a=br.readLine()) != null) {
			
			st = new StringTokenizer(a, " ");
			
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			sb.append(b+c).append("\n");
		
		}	
		System.out.println(sb);
	}
}
