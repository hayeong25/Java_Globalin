package Homework4;

//교재 179p OpenChallenge 끝말잇기 게임

import java.util.Scanner;

class Player {
	// 이름 필드
	String name;
	// 사용자로부터 단어를 입력받는 메소드
	public String getWordFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print(name + ">> ");
		String ss = sc.next();
		return ss;
	}
	// 끝말잇기의 성공 여부, 게임을 계속할지 판별하는 메소드
	public boolean checkSuccess(String s, String ss) {
		char lastChar = s.charAt(s.length()-1); // 마지막 문자에 대한 인덱스
		char firstChar = ss.charAt(0); // 첫 번째 문자
		if(lastChar == firstChar) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class WordGameApp {

	public WordGameApp() {
		System.out.println("끝말잇기 게임을 시작합니다.");
	}
	// 게임 진행
	public void run() {
		// 선수의 숫자만큼 Player 객체를 배열로 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇 명입니까 >> ");
		Player[] p = new Player[sc.nextInt()];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Player();
			System.out.print("참가자의 이름을 입력하세요 >> ");
			p[i].name = sc.next();
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		String s = "아버지";
		for(int i = 0; i < p.length; i++) {
			boolean b = p[i].checkSuccess(s, s=p[i].getWordFromUser());
			if(!b) {
				System.out.println(p[i].name + "이 졌습니다.");
				System.exit(0);
			}
			if(i == p.length-1) {
				i = -1;
			}
	}
}
	public static void main(String[] args) {
		WordGameApp g = new WordGameApp();
		g.run();
	}
}