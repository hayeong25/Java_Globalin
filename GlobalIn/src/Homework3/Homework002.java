package Homework3;

// 교재 126p 4번 문제

import java.util.*;

public class Homework002 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		while(true) {
		System.out.println("정수를 입력하세요 >> ");
		try {
			int n;
			n = sc.nextInt();
			if(n >= 0) {
				System.out.println(day[n % 7]);
			}
			else if(n < 0) {
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}
		catch(Exception e) {
			System.out.println("경고! 수를 입력하지 않았습니다.");
			break;
			}
		}
		sc.close();
	}
}