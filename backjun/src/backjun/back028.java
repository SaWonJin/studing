package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class back028 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,b,c; 
		a = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i =0; i<a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			b= Integer.parseInt(st.nextToken());
			c= Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+b+" + "+c+" = "+(b+c)+"\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
