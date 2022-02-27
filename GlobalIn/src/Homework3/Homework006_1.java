package Homework3;

import java.util.Scanner;

public class Homework006_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		int com, user;
		while(true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.println("가위 바위 보! >> ");
			switch(sc.nextLine()) {
			case "가위":
				user = 0;
				break;
			case "바위":
				user = 1;
				break;
			case "보":
				user = 2;
				break;
			case "그만":
				System.out.println("게임을 종료합니다...");
				System.exit(0);
			default:
				continue;
			}
			com = (int)(Math.random() * 3);
			if(user == com) {
				System.out.printf("사용자 = %s, 컴퓨터 = %s, 비겼습니다.\n", str[user], str[com]);
			}
			else if((user == com + 1) || (user == com - 2)) {
				System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.\n", str[user], str[com]);
			}
			else {
				System.out.printf("사용자 = %s, 컴퓨터 = %s, 컴퓨터가 이겼습니다.\n", str[user], str[com]);
			}
		}

	}

}