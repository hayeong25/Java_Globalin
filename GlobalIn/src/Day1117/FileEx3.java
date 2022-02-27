package Day1117;

import java.io.*;

public class FileEx3 {
	public static void main(String[] args) throws IOException {
		// 파일 생성
		File f1 = new File("c:/pk/newFile.txt");
		if(f1.exists()) {
			System.out.println("파일 이름 : " + f1.getName());
		}
		else {
			// IOException 발생
			if(f1.createNewFile()) {
				System.out.println("새로운 파일이 만들어졌습니다.");
			}
		}
		// 디렉토리 생성
		File f2 = new File("c:/newDirectory");
		if(!f2.exists()) {
			f2.mkdir();
		}
		else {
			System.out.println("디렉토리 이름 : " + f2.getPath());
		}
		// 파일 삭제
		File f3 = new File("c:/text.txt");
		if(f3.exists()) {
			f3.delete();
		}
		// 파일 혹은 디렉토리 이름 변경
		File src = new File("c:/pk/newFile.txt"); // 원본
		File dest = new File("c:/newDirectory/dest.txt"); // 복사본
		File dest2 = new File("c:/newDirectory/dest2.txt"); // 복사본
		if(src.exists()) {
			src.renameTo(dest);
			src.renameTo(dest2);
		}
		File f5 = new File("c:/");
		// 디렉토리 목록 출력
		if(f5.isDirectory()) {
			String dir[] = f5.list();
			System.out.println("\n\n 디렉토리 내용 =====");
			for (String dirs : dir) {
				System.out.println("dirs : " + dirs);
			}
		}
	}
}