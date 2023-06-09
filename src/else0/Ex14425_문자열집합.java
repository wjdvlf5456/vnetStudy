package else0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex14425_문자열집합 {
	
	public static void main(String[] args) throws IOException {
		
		List<String> sList = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String s;
		for (int i = 0; i < n; i++) {
			
			s = br.readLine();
			sList.add(s);
			
		}
		
		
		int count = 0;
		
		for (int i = 0; i < m; i++) {
			s = br.readLine();
			if (sList.contains(s)) {
				count++;
			}
			
			
		}
		
		bw.write(count+"");
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
