package Day1118;

// 파일에 문자 기록

import java.io.*;

/*
	PrintWriter
	- 다른 스트림과 다르게 바이트 출력 스트림과 문자 출력 스트림을 가지고 객체 생성
	- 자동 플러쉬 기능을 가지고 있음
	- 반드시 예외 처리를 해야 함(FileNorFoundException)
*/

public class PrintWriterEx {
	public static void main(String[] args) {
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("c:/pk/printWriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);
			pw.println("안녕하세요");
			pw.println("또 만났군요");
			pw.println(100.0);
			pw.println(new Boolean(true));
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(pw != null) {
					pw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}