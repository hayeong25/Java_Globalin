package Day1118;

import java.io.*;

// 역직렬화 해서 파일 내용 읽어오기

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("c:/pk/obj.sav"));
			// ObjectInputStream으로부터 읽어들인 직렬화 된 객체를 역직렬화 해 객체 생성
			// 역직렬화 할 때 클래스 파일을 찾지 못할 경우 ClassNotFoundException 발생
			Data d = (Data)ois.readObject();
			System.out.println("번호 : " + d.getNo());
			System.out.println("이름 : " + d.getName());
			System.out.println("메일  : " + d.getMail());
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}