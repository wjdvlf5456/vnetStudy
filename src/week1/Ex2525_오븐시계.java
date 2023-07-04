package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2525_오븐시계 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int oven = Integer.parseInt(st.nextToken());

		int result = hour * 60 + minute + oven;
		if (result >= 1440) {
			result = result % 1440;
			System.out.println(result / 60 + " " + result % 60);

		} else {
			System.out.println(result / 60 + " " + result % 60);

		}

		br.close();

	}
}
