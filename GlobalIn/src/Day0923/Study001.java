package Day0923;

import java.util.*;

public class Study001 {

	// 교재 84p if else문 가위바위보
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a, b;
		System.out.println("철수 : ");
		a = sc.next();
		System.out.println("영희 : ");
		b = sc.next();
		if(a.equals("가위")) {
			if(b.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(b.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
		if(a.equals("바위")) {
			if(b.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(b.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
		if(a.equals("보")) {
			if(b.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(b.equals("보")) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
		sc.close();
	}
}