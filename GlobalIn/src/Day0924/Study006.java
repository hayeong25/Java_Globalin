package Day0924;

import java.util.*;

public class Study006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int oman = 50000;
		int man = 10000;
		int chun = 1000;
		int obaek = 500;
		int baek = 100;
		int si = 10;
		int il = 1;
		int res, money;
		System.out.println("돈의 액수를 입력하세요 >> ");
		money = sc.nextInt();
		res = money / oman;
		money = money % oman;
		if(res > 0) {
			System.out.println("오만원 " + res + "개");
		}
		res = money / man;
		money = money % man;
		if(res > 0) {
			System.out.println("만원 " + res + "개");
		}
		res = money / chun;
		money = money % chun;
		if(res > 0) {
			System.out.println("천원 " + res + "개");
		}
		res = money / obaek;
		money = money % obaek;
		if(res > 0) {
			System.out.println("500원 " + res + "개");
		}
		res = money / baek;
		money = money % baek;
		if(res > 0) {
			System.out.println("100원 " + res + "개");
		}
		res = money / si;
		money = money % si;
		if(res > 0) {
			System.out.println("10원 " + res + "개");
		}
		res = money / il;
		money = money % il;
		if(res > 0) {
			System.out.println("1원 " + res + "개");
		}
		sc.close();
	}
}