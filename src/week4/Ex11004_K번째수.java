package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex11004_K번째수 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] nArray = new int[n]; 
		
		StringTokenizer secondSt = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			nArray[i] = Integer.parseInt(secondSt.nextToken());
		}
		Arrays.sort(nArray);
		
		sb.append(String.valueOf(nArray[k-1]));
		
		
		bw.write(sb.toString());
		
		
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
				
				
		
	}

}
