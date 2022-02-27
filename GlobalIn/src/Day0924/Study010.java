package Day0924;

import java.util.*;

public class Study010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String coffee;
		 int num;
		 System.out.println("커피 주문하세요 >> ");
		 coffee = sc.next();
		 num = sc.nextInt();
		 if(coffee.equals("에스프레소")) {
			 if(num >= 10) {
				 System.out.println((2000 * num * 0.95) + "원입니다.");
			 }
			 else {
				 System.out.println((2000 * num) + "원입니다.");
			 }
		 }
		 else if(coffee.equals("아메리카노")) {
			 System.out.println((2500 * num) + "원입니다.");
		 }
		 else if(coffee.equals("카푸치노")) {
			 System.out.println((3000 * num) + "원입니다.");
		 }
		 else if(coffee.equals("카페라떼")) {
			 System.out.println((3500 * num) + "원입니다.");
		 }
		 else {
			 System.out.println("오류");
		 }
		sc.close();
	}
}