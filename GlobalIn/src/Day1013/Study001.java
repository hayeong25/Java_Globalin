package Day1013;

import java.io.*;

public class Study001 {

	// 명령 인수를 이용하여 한 학생에 대해 여러 과목수와 과목명을 입력받아 성적 처리 하는 프로그램을 구현하시오
	public static void main(String[] ar) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(ar.length == 0) {
			System.out.println("subject1, subject2 ... ");
			System.exit(0); // 종료
		}
		System.out.print("Input Your Name : ");
		String name = br.readLine();
		String[] subject = new String[ar.length];
		for(int i = 0; i < ar.length; i++) {
			subject[i] = ar[i];
		}
		int jumsu[] = new int[(subject.length + 1)];
		for(int i = 0; i < jumsu.length - 1; i++) {
			System.out.print(subject[i] + "점수 : ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length - 1] += jumsu[i]; // 누적합
		}
		// System.out.println("합계 : " + jumsu[jumsu.length - 1]);
		float avg = jumsu[jumsu.length - 1] / (float)subject.length;
		avg = (int)((avg + 0.005) * 100) / 100.f; // 소수점 3자리에서 반올림
		// System.out.println("합계 : " + jumsu[jumsu.length - 1] + ", 평균 : " + avg);
		// 학점 계산
		char grade = 0;
		switch((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println();
		System.out.println("******성 적 표******");
		System.out.print("이름\t");
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t 평균\t 학점");
		System.out.print(name + "\t");
		for(int i = 0; i < subject.length; i++) {
			System.out.print(jumsu[i] + "\t");
		}
		System.out.println(jumsu[jumsu.length-1] + "\t" + avg + "\t  " + grade);
	}
}