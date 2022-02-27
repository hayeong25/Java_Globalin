package Day1117;

import java.io.File;

// 파일 목록 출력

public class FileEx2 {
	public static void main(String[] args) {
		File directory = new File("c:/");
		// exists() : 파일이나 디렉토리가 존재하는지를 알아보는 메소드. 존재하면 true
		if(directory.exists()) {
			if(directory.isDirectory()) {
				// 현재 디렉토리 내의 모든 파일이나 디렉토리의 이름을 가져옴
				String[] fileNameList = directory.list();
				for(String fileName : fileNameList) {
					System.out.println("파일 이름 : " + fileName);
				}
			}
		}
	}
}