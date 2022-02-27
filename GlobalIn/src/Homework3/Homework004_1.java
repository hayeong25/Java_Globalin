package Homework3;

import java.util.*;

public class Homework004_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] eng = {"student", "love", "java", "happy", "future"};
		String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};
		boolean s = true;
		String input = "";
		while(s) {
			System.out.println("영어 단어를 입력하세요 >> ");
			input = sc.next();
			if(input.equals(eng[0])) {
				System.out.println(kor[0]);
			}
			else if(input.equals(eng[1])) {
				System.out.println(kor[1]);
			}
			else if(input.equals(eng[2])) {
				System.out.println(kor[2]);
			}
			else if(input.equals(eng[3])) {
				System.out.println(kor[3]);
			}
			else if(input.equals(eng[4])) {
				System.out.println(kor[4]);
			}
			else if(input.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("그런 영어 단어가 없습니다.");
			}
		}
		sc.close();
	}
}