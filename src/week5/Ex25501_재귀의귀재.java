package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex25501_재귀의귀재 {

	public static int recursion(String s, int l, int r, int count) {
		count++;
		if (l >= r) {
			System.out.print(1 + " " + count);
			return 1;

		} else if (s.charAt(l) != s.charAt(r)) {
			System.out.print(0 + " " + count);
			return 0;
		} else {
			return recursion(s, l + 1, r - 1, count);
		}
	}

	public static int isPalindrome(String s) {
		int count = 0;

		return recursion(s, 0, s.length() - 1, count);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String word = st.nextToken();

			isPalindrome(word);
			System.out.println("");

		}

		br.close();

	}

}
