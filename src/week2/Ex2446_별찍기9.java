package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ex2446_별찍기9 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				
				System.out.print(" ");
			}

			for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < (2 * n + 1) - (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		br.close();
	}

}
