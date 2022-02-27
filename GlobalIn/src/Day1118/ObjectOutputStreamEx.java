package Day1118;

/*
	ObjectOutputStream과 ObjectInputStream은 각각 객체를 직렬화, 역직렬화 하는 스트림
	ObjectOutputStream의 주요 메소드
	- ObjectOutputStream : writeObject(Object obj)
	 	객체를 직렬화하고 스트림을 통해서 기록(전송)
	- ObjectInputStream : readObject()
		스트림을 통해 읽어들인 직렬화된 객체를 역직렬화(객체로 복원). 반환형이 Object이기 때문에 해당 객체 타입으로 형변환
*/

// 객체의 직렬화 : 파일에 저장하기

import java.io.*;

public class ObjectOutputStreamEx {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			// 메모리에 생성된 객체를 직렬화해서 스트림을 통해 기록할 수 있는 ObjectOutputStream 객체 생성
			oos = new ObjectOutputStream(new FileOutputStream("c:/pk/obj.sav"));
			// ObjectOutputStream을 통해서 직렬화된 후 파일로 기록됨. Data 객체 생성
			Data d = new Data();
			d.setNo(33);
			d.setName("홍길동");
			d.setMail("hong@naver.com");
			// ObjectOutputStream 객체를 직렬화해서 스트림을 통해 기록할 수 있는 writeObject() 메소드 제공
			oos.writeObject(d);
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}