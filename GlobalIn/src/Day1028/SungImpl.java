package Day1028;

import java.util.*;

// 인터페이스 구현하는 클래스
public class SungImpl implements Sung {
	Scanner sc = new Scanner(System.in);
	int in;
	Record re[];
	@Override
	public void set() {

		do {
			System.out.print("인원 수 입력 : ");
			in = sc.nextInt();
		} while(1 > in || in > 10);
		re = new Record[in];
	}

	@Override
	public void input() {

		for(int i = 0; i < re.length; i++) {
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			System.out.print("국어 영어 수학 점수 입력(공백 구분) : ");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			for (int j = 0; j < re[i].sco.length; j++) {
				if(re[i].sco[j] >= 90) {
					re[i].scor[j] = "수";
				}
				else if(re[i].sco[j] >= 80) {
					re[i].scor[j] = "우";
				}
				else if(re[i].sco[j] >= 70) {
					re[i].scor[j] = "미";
				}
				else if(re[i].sco[j] >= 60) {
					re[i].scor[j] = "양";
				}
				else {
					re[i].scor[j] = "가";
				}
			}
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum / 3;
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < re.length; i++) {
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d\n", re[i].number, re[i].name, re[i].sco[0], re[i].sco[1], re[i].sco[2], re[i].sum, re[i].avg);
			System.out.printf("\t\t %s\t %s\t %s\n", re[i].scor[0], re[i].scor[1], re[i].scor[2]);
		}
	}
}