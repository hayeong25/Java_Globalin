package Day1019;

	// 여러 학생의 성적을 입력받아 점수가 높은 순서대로 등수를 부여하여 결과를 출력하는 프로그램을 구현하시오. 단, 배열과 정렬 이용

import java.util.*;

	class Car {
		// 동일한 클래스 안에 메소드 생성. 메소드 이름이 같아도 파라미터 개수나 데이터 형식만 다르면 여러 개 선언 가능 = 메소드 오버로딩
		public Car() {
		}
		public Car(int a) {
		}
		public void add(int a, int b) {
			int c;
			c = a + b;
			System.out.println(c);
		}
		public void add(int a) {
			int c;
			c = a * a;
			System.out.println(c);
	}
	// 학생의 정보를 저장하는 클래스 멤버 필드
	class Record {
		String name;
		int sco;
	}

	// 성적 처리
	// 입력, 출력, 계산
	class Grade {
		Scanner sc = new Scanner(System.in);
		int n; // 인원 수
		Record[] rec;
		// 인원 수를 입력받아 설정하는 함수
		void set() {
			do {
				System.out.print("인원수 입력(1 ~ 100) : ");
				n = sc.nextInt();
			}
			while(n < 1 || n > 100);
			rec = new Record[n];
		}
		// 입력 처리
		void input() {
			for(int i = 0; i < rec.length; i++) {
				rec[i] = new Record(); // 인원 수만큼 배열 크기 할당
				System.out.printf("이름 점수 입력(%d) : ", (i + 1));
				rec[i].name = sc.next(); // 이름
				rec[i].sco = sc.nextInt(); // 점수
			}
			int pass = 0;
			Record temp = new Record();
			boolean flag;
			// 자리 바꿈이 일어났을 경우 true 일어나지 않으면 false
			do {
			flag = false;
			pass++;
			for(int i = 0; i < rec.length - pass; i++) {
				if(rec[i].sco < rec[i+1].sco) {
					temp = rec[i];
					rec[i] = rec[i+1];
					rec[i+1] = temp;
					flag = true; // 단 한 번이라도 스왑이 일어나게 되면 flag = true로 초기화
				}
			}
		} while(flag);
			// 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우
	} // input
		// 출력
		void print() {
			System.out.println();
			System.out.println("------------------------");
			for(int i = 0; i < rec.length; i++) {
				System.out.printf("%3d등 %5s %3d\n", i+1, rec[i].name, rec[i].sco);
			}
			System.out.println("------------------------");
		}
}

	public class Study001 {
		public void main(String[] args) {
	
			// 객체 생성
			Grade g = new Grade();
			g.set(); // 인원 수 입력
			g.input();
			g.print();
			Car c = new Car();
		}
	}
}