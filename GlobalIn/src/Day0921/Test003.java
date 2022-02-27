package Day0921;

import java.io.*;

public class Test003 {

	// 사용자 입력 메뉴 만들기
	public static void main(String[] args) throws IOException {

		int menu = 0;
		do {
			System.out.println("1. 회원가입 ");
			System.out.println("2. 회원조회 ");
			System.out.println("3. 회원수정 ");
			System.out.println("4. 회원탈퇴 ");
			System.out.println("0. 프로그램종료 ");
			System.out.print("메뉴 선택 : ");
			menu = System.in.read()-48;
			System.in.skip(2);
		}
		while(menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 0);
	}
}