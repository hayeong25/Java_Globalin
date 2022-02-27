package Day1005;

import java.util.*;

public class Study003 {

	public static void main(String[] args) {

	int low, high; // 수의 범위
	int k; // 증감값(정답)
	int n; // 입력받은 수를 저장하는 변수
	
	Random r = new Random(); // 난수 생성기
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요");
	
	// n이 입력될 때까지 반복 진행
	while(true) {
		int i = 0; // 사용자의 시행 횟수
		low = 0; // 최소값
		high = 99; // 최대값
		
		k = r.nextInt(100); // 0과 99 사이의 정수 (난수 생성해 저장)

		System.out.println(low + "-" + high); // 값의 범위를 출력
		System.out.println(i + 1 + ">>"); // 시행 횟수 출력
		n = 0;
		
		try {
			n = sc.nextInt(); // 수를 입력받음
		}catch(InputMismatchException e) {
			// 키 입력을 정수로 변환하지 못하는 경우 예외로 처리함
			System.out.println("정수만 입력하셔야 합니다.");
			sc.nextLine();
			continue; // 다시 시도함(계속 진행)
		}
		
		if((n > high) || (n < low)) { // high와 low의 범위를 벗어난 경우
			System.out.println("범위를 벗어났습니다");
		}
		else { // 범위가 정상인 경우
			if(n == k) {
				System.out.println("정답입니다. 수고하셨습니다.");
				break;
			}
			else if(n > k ) { // 입력한 정수가 정답보다 높은 범위의 수인 경우
				System.out.println("더 낮은 수 입력 바람");
				high = n;
			}
			else { // 입력값이 정답보다 낮은 범위의 수인 경우
				System.out.println("더 높은 수 입력 바람");
				low = n;
			}
			i++; // 시행 횟수 증가
		}
	System.out.println("다시 하시겠습니까(y/n)>>");
		if(sc.next().equals("n")) {
			break; // n이면 while문 종료
		}
		sc.close();
		}
	}
}