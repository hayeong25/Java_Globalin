package Day1102;

import java.io.*;

public class ExceptionEx8 {

	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	}
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다.");
			}
		} catch (Exception e) {
			fileName = "제목 없음.txt"; // fileName이 부적절한 경우, 파일 이름을 '제목 없음.txt'로 한다
		} finally {
			File f = new File(fileName); // File 클래스의 객체 생성
			createNewFile(f); // 생성된 객체를 이용해서 파일 생성
			return f;
		}
	}
	static void createNewFile(File f) {
		try {
			f.createNewFile(); // 파일 만드는 메소드
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}