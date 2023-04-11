package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2839_설탕배달 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int basket = 0;

		if (n == 4 || n == 7) {
			System.out.println(-1);
		} else {

			while (n > 2) {

				if (n % 5 == 0) {
					basket += n / 5;
					break;
					
				} else if (n % 5 == 3) {
					basket += n / 5 + 1;
					break;

				} else {
					basket += 1;
					n = n - 3;
				}

			}
			System.out.println(basket);
		}


		br.close();

	}

}
