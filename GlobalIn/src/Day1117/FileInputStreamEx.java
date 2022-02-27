package Day1117;

import java.io.*;

//  byte Stream 단위로

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		byte[] _read = new byte[100];
		byte[] console = new byte[100];
		try {
			System.out.print("파일명 : ");
			System.in.read(console);
			String file = new String(console).trim();
			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch(IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close(); // 파일을 다 읽은 후 파일 닫음
				}
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
}