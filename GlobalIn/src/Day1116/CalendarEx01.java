package Day1116;

/*
	Calendar 클래스는 추상 클래스로 객체를 생성할 수 없다
	추상 클래스는 미완성 클래스
	Calendar now = new Calendar();  불가능함
	1. Calendar now = Calendar.getInstance();
	2. Calendar now = new GregorianCalendar();
	3. GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar 클래스는 Calendar 클래스의 하위 클래스이다.
*/

import java.util.Calendar;

public class CalendarEx01 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1; // 1을 더하기 전은 0~11
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); // 1~7
		String week = "";
		switch(w) {
		case 1 :
			week = "일요일";
			break;
		case 2 :
			week = "월요일";
			break;
		case 3 :
			week = "화요일";
			break;
		case 4 :
			week = "수요일";
			break;
		case 5 :
			week = "목요일";
			break;
		case 6 :
			week = "금요일";
			break;
		case 7 :
			week = "토요일";
			break;
		}
		System.out.println(y + "-" + m + "-" + d + "-" + week);
		// 현재 날짜에 1000일을 더한다면?
		now.add(Calendar.DATE, 1000);
		System.out.printf("%tF\n", now);
		// 1598년 7월 31일
		now.set(1592, 7-1, 31); // MONTH가 0부터 11까지이므로 7이면 8월이 출력된다. 그래서 -1
		System.out.printf("%tF\n", now);
		// 일자만 10일로 변경
		now.set(Calendar.DATE, 10);
		System.out.printf("%tF\n", now);
		// 해당 월의 마지막 일자 출력
		int dd = now.getActualMaximum(Calendar.DATE);
		System.out.println("해당 월의 마지막 날짜 : " + dd);
	}
}