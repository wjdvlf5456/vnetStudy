package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {

		List<String> bList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] word = br.readLine().split("");

		StringBuilder sb = new StringBuilder();

		int count = 1;

		for (int i = 0; i < word.length; i++) {
			sb.append(word[i]);
			if (word[i].equals("<")) {
			} else {

			}
			

		}

		
		bw.flush();
		bw.close();
		br.close();

	}

}
