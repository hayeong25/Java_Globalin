package Day1117;

import java.io.*;

// 파일을 byte[]단위로 복사

public class FileCopyEx2 {
	public static void main(String[] args) {
		System.out.println("===== 파일 복사 시간 =====");
		long start = System.currentTimeMillis();
		FileInputStream src = null;
		FileOutputStream dest = null;
		try {
			src = new FileInputStream("c:/ppp.zip");
			dest = new FileOutputStream("c:/ddd.zip");
			// 임시 저장소에 저장된 data의 전체 개수를 저장할 변수 선언
			int length = 0;
			// 임시 저장소로 사용할 byte[] 선언
			byte[] buffer = new byte[1024 * 8];
			// InputStream을 통해서 읽어들인 data를 임시저장소에 저장하고 저장된 data의 개수를 length에 저장
			while ((length = src.read(buffer)) != -1) {
				// OutputStream을 통해서 임시저장소에 저장되어 있던 data를 length만큼 파일에 기록
				dest.write(buffer, 0, length);
			}
		}catch (FileNotFoundException fe) {
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