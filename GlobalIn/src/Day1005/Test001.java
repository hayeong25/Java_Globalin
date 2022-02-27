package Day1005;

import java.util.*;

public class Test001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j, k, num;
		System.out.print("한 행에 표시할 단 수 입력 : ");
		num = sc.nextInt();

		for(i = 0; i < 9; i+=num) {
			for(j = 1; j <=9; j++) { // 1 ~ 9까지 반복
				for(k = 1; k <= num; k++) {
					if(i + k <= 9) { // 단위 범위
						System.out.print((i + k) + " * " + j + " = " + ((i + k) * j) + "\t\t");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}