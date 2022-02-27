package Day0918;

import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int m;
		System.out.println("월을 입력하세요 : ");
		m = Integer.parseInt(br.readLine());
		switch(m) {
		case 1: case 2: case 12 :
			System.out.println("겨울");
		break;
		case 3: case 4: case 5:
			System.out.println("봄");
		break;
		case 6: case 7: case 8:
			System.out.println("여름");
		break;
		case 9: case 10: case 11:
			System.out.println("가을");
		break;
		default:
			System.out.println("오류");
		}
	}
}