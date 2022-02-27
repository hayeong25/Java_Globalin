package Day0918;

import java.util.*;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		float avg;
		char grade;
		System.out.println("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요 : ");
		mat = sc.nextInt();
		sum = kor + eng + mat;
		avg = sum / 3.f;
		if((int)avg >= 90) {
			grade = 'A';
		}
		else if((int)avg >= 80) {
			grade = 'B';
		}
		else if((int)avg >= 70) {
			grade = 'C';
		}
		else if((int)avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("%c학점입니다.", grade);
		sc.close();

	}

}