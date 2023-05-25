package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import org.omg.CORBA.StringHolder;

public class Ex10818_최소최대 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());

		int[] nArray = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			nArray[i] = Integer.parseInt(st.nextToken());

		}

		Arrays.sort(nArray);
		
		String min = String.valueOf(nArray[0]);
		String max = String.valueOf(nArray[n-1]);
		sb.append(min);
		sb.append(" ");
		sb.append(max);
		
		bw.write(sb.toString());
		
		
		

		bw.flush();
		bw.close();
		br.close();

	}

}
