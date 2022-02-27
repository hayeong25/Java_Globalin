package Day1118;

import java.io.*;
//파일에 텍스트를 기록

public class FileWriterEx {

 public static void main(String[] args) {

	 FileWriter writer = null;

	 try {
		 //파일에 한 문자 단위로 기록할 수 있는 FileWriter 객체를 생성한다
		 writer = new FileWriter("c:/pk/song.txt");
		 // writer는 문자열을 기록할 수 있다
		 String str = "학교 종이 땡떙땡 어서 모이자";
		 writer.write(str);
		 // 한글자 단위로 읽고 쓸 수 있는 Reader, Writer 계열의 스트림은 내부적으로 버퍼를 내장하고 있다.
		 // 내장된 버퍼는 버퍼가 가득 채워질 때에만 스트림을 통해 내보낸다.
		 // flush() 메소드는 버퍼가 가득차지 않아도 비우게 한다.
		 writer.flush();
	 } catch (FileNotFoundException fe) {
		 fe.printStackTrace();
	 } catch (IOException io) {
		 io.printStackTrace();
	 } finally {
		 try {
			if(writer != null) {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
 }
}