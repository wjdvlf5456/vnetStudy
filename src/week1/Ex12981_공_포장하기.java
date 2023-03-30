package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex12981_공_포장하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int red = Integer.parseInt(st.nextToken());
		int green = Integer.parseInt(st.nextToken());
		int blue = Integer.parseInt(st.nextToken());

		List<Integer> rgbList = new ArrayList<Integer>();

		rgbList.add(red);
		rgbList.add(green);
		rgbList.add(blue);

		// 오름차순으로 정렬
		Collections.sort(rgbList);

		// 박스의 개수
		int result = 0;

		// 서로 다른 공 먼저 추가
		result += rgbList.get(0);

		rgbList.set(1, rgbList.get(1) - result);
		rgbList.set(2, rgbList.get(2) - result);

		rgbList.remove(0);
		
		System.out.println(rgbList.toString());

		if (rgbList.get(0) == rgbList.get(1)) {
			result += (rgbList.get(0) / 3) + (rgbList.get(1) / 3) + 1;
		} else {
			result += (rgbList.get(0) / 3) + (rgbList.get(1) / 3) + 2;

		}

		System.out.println(result);

		br.close();

	}

}
