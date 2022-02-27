package Homework3;

// 교재 128p 8번 문제

import java.util.*;

public class Homework006 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.println("가위 바위 보! >> ");
			String s;
			s = sc.next();
			int n = (int)(Math.random() * 3);
			if(str[n].equals("가위")) {
				if(s.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				}
				else if(s.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				}
				else if(s.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
				}
			}
			else if(str[n].equals("바위")) {
				if(s.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
				}
				else if(s.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				}
				else if(s.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
				}
			}
			else if(str[n].equals("보")) {
				if(s.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				}
				else if(s.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
				}
				else if(s.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
				}
			}
		}
	}
}