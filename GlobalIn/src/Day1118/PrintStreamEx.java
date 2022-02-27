package Day1118;

import java.io.*;

// PrintStream : 자바의 모든 자료형을 출력할 수 있다. 연결된 스트림은 System.out, System.err 객체가 PrintStream 객체가 됨

public class PrintStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream("c:/pk/printStream.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true);
			ps.println("홍길동");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
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
				if(ps != null) {
					ps.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}