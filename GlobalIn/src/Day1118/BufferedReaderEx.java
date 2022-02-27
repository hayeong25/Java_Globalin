package Day1118;

import java.io.*;

public class BufferedReaderEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		// BufferedReader(new InputStreamReader(System.in));
		try {
			fis = new FileInputStream("c:/pk/hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			// 한 라인씩 읽어들인 문자열을 저장할 변수 선언
			String str = null;
			// readLine() 개행문자를 만나면 개행문자 이전까지의 문자열을 반환하고 스트림 끝에 도달하면 null 값을 반환
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}