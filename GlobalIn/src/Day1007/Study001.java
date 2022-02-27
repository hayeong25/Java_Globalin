package Day1007;

import java.util.*;

public class Study001 {

	// 처음 입력받은 인원 수만큼의 학생 이름과 전화번호를 입력받고 입력받은 내용 전체를 출력하는 프로그램을 작성하시오. 단, 배열
	/*
	 입력 처리 할 학생 수(명) : 3
	 이름 전화번호 입력(1)[공백구분] : 홍길동 010-1234-1234
	 이름 전화번호 입력(2)[공백구분] : 홍길동 010-1234-1234
	 이름 전화번호 입력(3)[공백구분] : 홍길동 010-1234-1234
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, i; // 인원 수를 저장할 변수
		System.out.println("입력 처리 할 학생 수(명) : ");
		n = sc.nextInt();
		String[] name = new String[n]; // 학생별 이름 저장 변수
		String[] phone = new String[n]; // 학생별 전화번호 저장 변수
		for(i = 0; i < name.length; i++) {
			System.out.print("이름, 전화번호 입력(" +(i+1) + ")[공백구분]");
			name[i] = sc.next();
			phone[i] = sc.next();
		}
		System.out.println();
		System.out.println("전체 학생 수 : " + n + "명");
		System.out.println();
		System.out.println("  이름             전화번호");
		for(i = 0; i < name.length; i++) {
			System.out.println(name[i] + "     " + phone[i]);
		}
	}
}