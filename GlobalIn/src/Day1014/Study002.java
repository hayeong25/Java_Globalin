package Day1014;

import java.io.*;

	// Study001을 레기드 배열로 변환

public class Study002 {

	public static void main(String[] ar) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int human = Integer.parseInt(ar[0]);// 학생 수 구하기
		// System.out.print("학생 수 입력 : ");
		// int human = Integer.parseInt(br.readLine());

		String[]name = new String[human];// 학생 수만큼 이름을 입력받을 공간을 할당

		// System.out.print("과목 명 입력 : ");
		String[][] subject = new String[human][];

		// 점수와 총점 처리 배열
		int[][] jumsu = new int[human][];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int [] rank = new int[human];
 
		// 학생 수만큼 반복처리
		for(int i = 0 ; i<human ; i++) {
			System.out.print(i+1+"번째 학생 이름 : ");
			name[i] = br.readLine();
			// 과목 초기화
			System.out.print("과목 수 : ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];
			for(int j = 0; j < subject[i].length; j++) {
				System.out.print((j + 1) + "번째 과목 : ");
				subject[i][j] = br.readLine();
			}
			// 과목 점수 초기화
			jumsu[i] = new int[imsi + 1];
			System.out.println(name[i] + "학생 점수 입력 : ");
			for(int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "점수 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine()); // 과목별 점수
				jumsu[i][jumsu[i].length - 1] += jumsu[i][j]; // 총점
			}
			System.out.println("총점 : " + jumsu[i][subject.length]);
		}
		// 평균 구하기
		for(int i = 0; i < human; i++) {
			avg[i] = ((float)jumsu[i][jumsu[i].length - 1] / subject[i].length);
			// 소수점 세 번째 자리까지 반올림해서 소수점 두 번째 자리까지 구하기
			avg[i] = ((int)((avg[i] + 0.005) * 100) / 100.f);
		}
		for(int i = 0; i < human; i++) {
			switch((int)(avg[i] / 10)) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
				break;
			}
		}
		// 석차 계산
		for(int i = 0; i < human; i++) {
			rank[i]++;
			for(int j = 0; j < human; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		// 성적표 출력
		System.out.println();
		System.out.println("******성 적 표******");
		System.out.print("이름\t");
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t 평균\t 학점\t 석차");
		for(int i = 0; i < human; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < subject.length+1; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.println(avg[i] + "  " + grade[i] + "   " + rank[i]);
		}
	}
}