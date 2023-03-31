package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < t; j++) {

				System.out.print(" ");

			}

			for (int k = 1; k < i + 1; k++) {
				System.out.print("*");

			}

			t--;

			System.out.println("");

		}

		br.close();
	}

}
