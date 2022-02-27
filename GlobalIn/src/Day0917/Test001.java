package Day0917;

import java.io.*;

public class Test001 {

// BufferedReader, Switch 사용해서 국, 영, 수 3과목의 합과 평균, 이름, 학점 등급을 출력하시오
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, sum = 0;
		float avg;
		String name;
		
		System.out.println("이름 : ");
		name = br.readLine();
		
		System.out.println("국어 점수를 입력하세요 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.println("영어 점수를 입력하세요 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.println("수학 점수를 입력하세요 : ");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		avg = sum / 3.f;
		
		System.out.printf("%s의 총점은 %d점, 평균은 %f점입니다.", name, sum, avg);
		
		switch((int)avg / 10) {
		case 10 :
		}
		
	}
}