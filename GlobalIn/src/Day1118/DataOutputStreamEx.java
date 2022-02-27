package Day1118;

/*
	DataOutputStream과 DataInputStream
	- 특정 데이터 타입과 포맷을 유지한 채 데이터를 기록하고 읽어올 수 있는 스트림
	- 특정 데이터 포맷과 타입을 맞게 읽고 쓸 수 있는 readBoolean(), writhBoolean(boolean v), readInt(), writeInt(int v), readUTF(), writeUTF(String s) 등의 메소드를 제공함
	DataOutputStream
	- 자료형에 데이터를 파일에 기록
*/

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		// DataOutputStream은 기본 자료형 타입 그대로 스트림을 통해서 기록할 수 있다
		// DataOutputStream은 1차 스트림이 아니기 때문에 다른 스트림을 이용해서 특정 디바이스와 연결될 수 있다
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try {
			// DataOutputStream과 연결된 FileOutputStream 객체 생성
			fos = new FileOutputStream("c:/pk/data.sav");
			// 기본 자료형의 타입을 유지한 채 기록할 수 있는 DataOutputStream 객체 생성
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "자바가 최고야";
			// DataOutputStream은 기본 자료형 별로 write()가 존재
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			System.out.println("성공적으로 파일을 기록하였습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}