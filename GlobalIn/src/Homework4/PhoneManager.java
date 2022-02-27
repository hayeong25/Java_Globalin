package Homework4;

import java.util.Scanner;

class Phone {
	
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
}

public class PhoneManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 >> ");
		int number = sc.nextInt();
		
		Phone[] p = new Phone[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
			p[i] = new Phone(sc.next(), sc.next());
		}
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			
			boolean b = false;
			
			System.out.print("검색할 이름 >> ");
			String n = sc.next();
			
			for (int i = 0; i < number; i++) {
				if(n.equals(p[i].getName())) {
					System.out.println(p[i].getName() + "의 번호는 " + p[i].getTel() + "입니다.");
					b = true;
				}
			}
			
			if(n.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(b == false) {
				System.out.println(n + "이 없습니다.");
			}

		}
		sc.close();
	}	
}