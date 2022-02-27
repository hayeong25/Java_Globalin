package Day1112;

import java.io.IOException;
import java.util.*; // Vector로 구현

interface Score {
	// 등록, 수정, 삭제, 전체 목록, 학번 검색, 이름 검색
	public void insert();
	public void update();
	public void delete();
	public void listAll();
	public void searchHak();
	public void searchName();
}

class ScoreImpl implements Score {

	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void insert() {
		System.out.println("\n 자료 추가 ..........");
		String hak;
		System.out.print("학번 : ");
		hak = sc.next();
		ScoreVO temp = readScore(hak);
		if(temp != null) {
			System.out.println("이미 등록된 학번입니다. \n");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수 : ");
		vo.setMat(sc.nextInt());
	}
	// 학번(ScoreVO)을 읽어오는 메소드
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for(ScoreVO temp : list) {
			if(temp.getHak().equals(hak)) {
				vo.temp;
			}
			break;
		}
		return vo;
	}

	@Override
	public void update() {
	}

	@Override
	public void delete() {
	}

	@Override
	public void listAll() {
	}

	@Override
	public void searchHak() {
	}

	@Override
	public void searchName() {
	}
}

public class ScoreMain {
	public static void main(String[] args) throws IOException {
		char ch;
		Score score = new ScoreImpl();
		while(true) {
			do {
				System.out.print("1. 추가 2. 수정 3. 삭제 4. 전체 출력 5. 학번 검색 6. 이름 검색 7. 종료");
				ch = (char)System.in.read();
				System.in.skip(2);
			} while((ch < '1') || (ch > '7'));
			switch(ch) {
			case '1' :
				score.insert();
				break;
			case '2' :
				score.update();
				break;
			case '3' :
				score.delete();
				break;
			case '4' :
				score.listAll();
				break;
			case '5' :
				score.searchHak();
				break;
			case '6' :
				score.searchName();
				break;
			case '7' :
				System.exit(0);
			}
		}
	}
}