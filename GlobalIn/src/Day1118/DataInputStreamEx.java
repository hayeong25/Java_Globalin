package Day1118;

// DataInputStream : 특정 자료형의 포맷과 값을 유지한 채로 읽어옴

import java.io.*;

public class DataInputStreamEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		 try {
			 fis = new FileInputStream("c:/pk/data.sav");
			 dis = new DataInputStream(fis);
			 // DataInputStream 은 기본자료형을 유지한 채로 저장된 값을 읽어올 수 있는 read()메소드가 존재한다
			 // 읽어들일때는 반드시 기록한 순서대로 읽어와야한다.
			 int i = dis.readInt();
			 double d = dis.readDouble();
			 String s = dis.readUTF();
			 
			 System.out.println("i값 : " + i);
			 System.out.println("d값 : " + d);
			 System.out.println("s값 : " + s);
			 System.out.println("모든 파일을 성공적으로 읽어 들였습니다.");
		 } catch (FileNotFoundException fe) {
			 fe.printStackTrace();
		 } catch (IOException io) {
			 io.printStackTrace();
		 } finally {
			 try {
			 	if(fis != null) {
			 		fis.close();
			 	}
			 }catch(IOException e) {
				e.printStackTrace();
			 }
			 
			 try {
				 if(dis != null) {
					 dis.close();
				 }
			 } catch (IOException io) {
				 io.printStackTrace();
			 }
		 }
	}
}