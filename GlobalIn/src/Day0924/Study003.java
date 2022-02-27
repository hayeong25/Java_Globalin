package Day0924;

import java.util.*;

public class Study003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("x값을 입력하세요 >> ");
		i = sc.nextInt();
		System.out.println("x=" + i + "y=" + ((i * i) - (3 * i) + 7));
		sc.close();
	}
}