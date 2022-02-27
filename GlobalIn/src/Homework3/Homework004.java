package Homework3;

// 교재 127p 6번 문제

import java.util.*;

public class Homework004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] eng = {"student", "love", "java", "happy", "future"};
		String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};
		boolean j = false;
		while(true) {
		j = false;
		System.out.println("영어 단어를 입력하세요 >> ");
		String n = sc.next();
		for(int i = 0; i < eng.length; i++) {
			if(n.equals(eng[i])) {
				System.out.println(kor[i]);
				j = true;
			}
	
		}
		if(n.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}
		else if(j == false) {
			System.out.println("그런 영어 단어가 없습니다.");
		}
		}
		sc.close();
	}
}