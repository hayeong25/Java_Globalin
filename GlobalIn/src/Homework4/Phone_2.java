package Homework4;

import java.util.Scanner;

public class Phone_2 {

	private String name, tel;
	
	public Phone_2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름과 전화번호 입력 >> ");
		Phone_2 one = new Phone_2(sc.next(), sc.next());
		System.out.print("이름과 전화번호 입력 >> ");
		Phone_2 two = new Phone_2(sc.next(), sc.next());
		
		System.out.println(one.getName() + "의 번호 " + one.getTel());
		System.out.println(two.getName() + "의 번호 " + two.getTel());
		
		sc.close();
	}
}
