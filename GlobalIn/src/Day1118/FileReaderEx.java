package Day1118;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			// 파일로부터 한문자 단위로 읽어올 수 있는 FileReader 객체를 생성
			reader = new FileReader("c:/pk/song.txt");
			// 스트림을 통해서 읽어들인 유니코드 값을 저장할 변수 선언
			int readValue = 0;
			while((readValue = reader.read()) != -1) {
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}