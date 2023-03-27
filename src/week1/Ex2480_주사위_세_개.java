package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex2480_주사위_세_개 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] nArr = new int[3];
		
		nArr[0] = a;
		nArr[1] = b;
		nArr[2] = c;
		
		
		
		
		int same;

		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);

		} else if (a == b || b == c || a == c) {
			if (a == b) {
				same = a;
			} else {
				same = c;

			}
			System.out.println(1000 + same * 100);

		} else {
			Arrays.sort(nArr);
			System.out.println(nArr[2]*100);
			
			

		}

		br.close();

	}
}
