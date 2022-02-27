package Day1006;

import java.util.*;

public class Study004 {

	// 사용자로부터 임의의 정수를 임의의 개수만큼 입력받아 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현하시오
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, i, max = 0;
		System.out.println("입력할 데이터 개수 : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("정수를 " + n + "개 입력하세요 : ");
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("배열에 저장된 수 중 가장 큰 수 >> " + max);
	}
}