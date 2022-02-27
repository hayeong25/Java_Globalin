package Day1117;

import java.io.*;

// 파일 복사 (1byte 단위로 복사)

public class FileCopyEx1 {
	public static void main(String[] args) {
		System.out.println("===== 파일 복사 시작 =====");
		long start = System.currentTimeMillis(); // 시작하는 시점에서의 현재 시간의 밀리 초로
		FileInputStream src = null; // 파일 입력 스트림 선언
		FileOutputStream dest = null; // 파일 출력 스트림 선언
		try { 
			// 원본 파일을 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("c:/pk.zip"));
			// 복사본 파일을 생성하기 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("c:/dest.zip"));
			// FileInputStream을 통해서 읽어들인 값을 저장할 변수 선언 및 초기화
			int readValue = 0;
			// FileInputStream의 read() 메소드를 통해서 읽어들인 값을 readValue에 저장
			while((readValue = src.read()) != -1) {
				// readValue에 저장된 값을 FileOutputStream의 write() 메소드를 통해서 파일에 기록
				dest.write(readValue);
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(dest != null) {
					dest.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
			}
			try {
				if(src != null) {
					src.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		long copyTime = (end - start) / 1000;
		System.out.println("복사에 걸린 시간 : " + copyTime + "초");
	}
}