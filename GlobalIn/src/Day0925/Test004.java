package Day0925;

public class Test004 {

	// 1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합과 그때의 n값을 출력하는 프로그램을 구현하시오
	// while 사용
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int limit = 5000;
		do {
			sum += ++i;
		}
		while(sum <= 5000);
		System.out.printf("1부터 n까지의 합 중에서 %d를 넘지않는 가장 큰 합은?\n", limit);
		System.out.printf("1부터 %d까지의 합은 %d입니다.\n", (i-1), (sum-i));
		System.out.printf("그때의 n값은 %d입니다.", (i-1));
	}
}