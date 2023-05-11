package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {

		List<String> bList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int listSize = st.countTokens();

		for (int i = 0; i < listSize; i++) {
			String word = st.nextToken();
			bList.add(word);

		}

		StringBuffer sb = new StringBuffer();
		StringBuilder sBuild = new StringBuilder(); 

		for (int i = 0; i < bList.size(); i++) {

			sb.delete(0, sb.length());

			sb.append(bList.get(i));

			sb.reverse();
			bList.set(i, sb.toString());
			
			if (i == bList.size()-1) {
				sBuild.append(bList.get(i));
				
			} else {
				sBuild.append(bList.get(i)+" ");

			}

		}

		System.out.println(sBuild.toString());
		
		
		bw.flush();
		bw.close();
		br.close();

	}

}
