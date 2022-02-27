package Day1117;

import java.io.File;

// 파일 정보 출력
public class FileEx1 {
	public static void main(String[] args) {
		File file = new File("c:\\pk\\hello.txt");
		System.out.println("파일인지 여부 : " + file.isFile());
		System.out.println("디렉토리인지 여부 : " + file.isDirectory());
		System.out.println("상대 경로 : " + file.getPath());
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		System.out.println("디렉토리 혹은 파일의 이름 : " + file.getName());
		System.out.println("파일의 길이 : " + file.length());
		System.out.println("파일의 최종 수정 날짜 : " + file.lastModified());
	}
}