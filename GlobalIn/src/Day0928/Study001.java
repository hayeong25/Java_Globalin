package Day0928;

import java.util.*;

public class Study001 {

	// up & down 게임
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100);
			int i = 1;
			int n;
			int min = 0;
			int max = 99;
			String y;
			System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요.");
			System.out.println("0-99");
			System.out.println(i + ">>");
			n = sc.nextInt();
			while(n != k) {
			if(n < k) {
				min = n;
				System.out.println("더 높게");
				System.out.println(min + "-" + max);
				System.out.println(++i + ">>");
				n =sc.nextInt();
			}
			else {
				max = n;
				System.out.println("더 낮게");
				System.out.println(min + "-" + max);
				System.out.println(++i + ">>");
				n = sc.nextInt();
			}
			}
			System.out.println("맞았습니다");
			System.out.println("다시 하시겠습니까(y/n) >>");
			y = sc.next();
			if(y.equals("y")) {
				continue;
			}
			else if(y.equals("n")) {
				sc.close();
				break;
			}
			else {
				System.out.println("입력 오류");
			}
		}
	}
}