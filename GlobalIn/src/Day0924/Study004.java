package Day0924;

import java.util.*;

public class Study004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("점 (x, y)의 좌표를 입력하세요 >> ");
		x = sc.nextInt();
		y = sc.nextInt();
		if((x >= 50) && (x <= 100) && (y >= 50) && (y <= 100)) {
			System.out.printf("점(%d, %d)은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.");
		}
		sc.close();
	}
}