package Day1116;

import java.util.Calendar;

public class MyCalendar {

	private int months[] = {31,28,31,30,31,31,30,31,30,31,30,31};
	Calendar cal = Calendar.getInstance();
	int y, m, d;

	public MyCalendar() {
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH);
		d = cal.get(Calendar.DATE);
	}
	
	public void set(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;

		// 윤년, 평년 구분
		// y년도의 2월의 일수를 계산
		if(y % 4 == 0 && 100 != 0 || y % 400 == 0) {
			months[1] = 29;
		}else {
			months[1] = 28;
		}
	}

	public boolean isValidDate() {
		boolean result = true;
		if(y < 1 || m < 1 || m > 12 || d < 1 || d > months[m-1]) {
			return false;
		}
		return result;
	}

	public int total() {
		// 1년 1월 1일 ~ (y - 1)년 12월 31일 까지의 전체 날짜 수
		int n = (y - 1) * 365 + (y - 1) / 4 - (y - 1) * 100 + (y - 1) / 400;

		// y년 (m - 1)월 까지의 날짜 수 
		for(int i = 0; i < (m - 1); i++) {
			n += months[i];
		}
		
		// y년 m월 d일 까지의 날짜 수
		n += d;

		return n;
}

	public String weekDay() {
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		if(!isValidDate()) {
			return null;
		}
		int w = total() % 7; // w가 1이면 y년 m월 1일은 월요일
		return week[w];
}

	public void writeCalendar() {

		int t = total() - d + 1;
		int w = t % 7 + 1;


		System.out.printf("\n\t%4d년 %2d월\n\n", y, m);
		System.out.println("    일     월     화    수     목     금    토");
		System.out.println("===================================");
		for(int i = 1; i < w; i++) {
			System.out.println("  ");
		}

		for(int i = 1; i <= months[m-1]; i++) {
			System.out.printf("%4d", i);
			w++;
			if(w % 7 == 1) {
				System.out.println();
			}
		}
		if(w % 7 != 1) {
			System.out.println();
		}
	System.out.println("===================================");
	}
}