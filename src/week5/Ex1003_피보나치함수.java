package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1003_피보나치함수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			int zero = 0;
			int one = 1;
			int next = 0;
			if (n < 1) {
				System.out.println(one + " " + zero);
			} else {
				for (int j = 0; j < n - 1; j++) {
					next = zero + one;
					zero = one;
					one = next;

				}
				System.out.println(zero + " " + one);
			}

		}

		br.close();

	}

}
