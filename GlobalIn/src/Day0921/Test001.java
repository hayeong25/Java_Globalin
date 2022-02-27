package Day0921;

public class Test001 {

	// for, while, do~ while
	public static void main(String[] args) {
		// 1부터 100까지의 합계를 구하는 프로그램을 작성하시오
		// 1. 변수 선언
		int i;
		int sum = 0;
		// for(초기값; 조건값(종료값); 증감값)
		for(i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(i + "부터 100까지의 합계는 " + sum + "입니다.");
		}
		// for문 밖에 System.out.println("1부터 100까지의 합계는 " + sum + "입니다."); 라고 하면 최종 합계값만 출력
		// 위의 문제를 while문으로 바꾸면
		/* 초기값
		 * while (조건) {
		 * 실행문
		 * 증감값
		 *  }
		 */
		i = 0;
		while(i <= 100) {
			sum += i; // 실행문
			i++; // 증감값
		}
		// 위의 문제를 do ~ while문으로 바꾸면
		/* 초기값
		 * do {
		 * 수행할 문장
		 * }
		 * while (조건);
		 */
		sum = 0;
		i = 0;
		
		do {
			sum += i; // 실행문
			i++; // 증감값
		}
		while(i <= 100);
		// 무한반복
		for(;;) {
			System.out.println("사랑해");
			System.out.println("나두 따랑해");
		}
		
//		while(true) {
//			System.out.println("사랑해요");
//			System.out.println("진짜 마니 사랑해");
//		}
		
//		do {
//			System.out.println("따랑해");
//			System.out.println("꼬마워요~");
//		} while(true);
	}
}