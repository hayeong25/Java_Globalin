package Day0924;

import java.util.*;

public class Study008_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String coffee;
		int num;
		System.out.println("커피 주문하세요 >> ");
		coffee = sc.next();
		num = sc.nextInt();
		switch(coffee) {
		case "에스프레소" :
			System.out.println((2000 * num) + "원입니다.");
		case "아메리카노" :
			System.out.println((2500 * num) + "원입니다.");
		case "카푸치노" :
			System.out.println((3000 * num) + "원입니다.");
		case "카페라떼" :
			System.out.println((3500 * num) + "원입니다.");
		default:
			 System.out.println("오류");
		}
		sc.close();		
	}
}