package Day0916;

import java.util.*;

public class Test001 {

	// if문 사용해 임의의 정수 3개 오름차순 정렬하기
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int a, b, c;
		int temp = 0;
		
		System.out.println("첫 번째 정수 : ");
		a = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		b = sc.nextInt();
		
		System.out.println("세 번째 정수 : ");
		c = sc.nextInt();
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
			/* a = a ^ b; XOR 연산자를 이용해서도 정렬할 수 있다
			 * b = b ^ a;
			 * a = a ^ b;
			 */
		}
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
			/* a = a ^ c;
			 * c = c ^ a;
			 * a = a ^ c;
			 */
		}
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
			/* b = b ^ c;
			 * c = c ^ b;
			 * b = b ^ c;
			 */
		}
	
		System.out.println(a + " " + b + " " + c);

		sc.close();

	}	
}