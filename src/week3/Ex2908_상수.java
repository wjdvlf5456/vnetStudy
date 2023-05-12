package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2908_상수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// 숫자 A 반전
		String a = st.nextToken();
		sb.append(a);
		int numA = Integer.parseInt(sb.reverse().toString());
		

		// StringBuilder 초기화
		sb.delete(0, a.length());
		

		// 숫자 B 반전
		String b = st.nextToken();
		sb.append(b);
		int numB = Integer.parseInt(sb.reverse().toString());
		

		// 상수의 크기에 따라 결과 출력
		if (numA > numB) {
			System.out.println(numA);

		} else {
			System.out.println(numB);

		}

		br.close();
	}

}
