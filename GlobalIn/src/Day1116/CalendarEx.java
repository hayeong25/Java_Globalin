package Day1116;

import java.util.*;

public class CalendarEx {

	Scanner sc = new Scanner(System.in);
	
	public void calendar() {
		MyCalendar cal = new MyCalendar();

		int y, m;

		// 년도와 월 입력
		System.out.print("년도 입력 : ");
		y = sc.nextInt();
		System.out.print("월 입력 : ");
		m = sc.nextInt();

		cal.set(y, m, 1);
		cal.writeCalendar();
	}

	public void week() {
		MyCalendar cal = new MyCalendar();

		int y, m, d;

		System.out.print("년도 입력 : ");
		y = sc.nextInt();
		System.out.print("월 입력 : ");
		m = sc.nextInt();
		System.out.print("일 입력 : ");
		d = sc.nextInt();

		cal.set(y, m, d);
		String w = cal.weekDay();

		System.out.printf("%d년 %d월 %d일은 %s입니다.\n\n", y, m, d, w);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CalendarEx ob = new CalendarEx();
		int n;
		while(true) {
			do {
				System.out.println("1.달력\n2.요일\n3.종료");
				n = sc.nextInt();
			}while(n < 1 || n > 3);
			
			switch(n) {
			case 1 :
				ob.calendar();
				break;
			case 2 : 
				ob.week();
				break;
			case 3 : 
				sc.close();
				System.exit(0);
			}
		}
	}
}